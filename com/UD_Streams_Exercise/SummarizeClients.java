package com.UD_Streams_Exercise;

import com.UD_Streams_Exercise.ClientStore;
import com.UD_Streams_Exercise.UdacisearchClient;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public final class SummarizeClients {
    public static void main(String[] args) {

        int numClients = 0;
        int totalQuarterlySpend = 0;
        UdacisearchClient nextExpiration = null;
        Set<ZoneId> representedZoneIds = new HashSet<>();
        Map<Year, Integer> contractsPerYear = new HashMap<>();

        for (UdacisearchClient client : ClientStore.getClients()) {
            numClients++;
            totalQuarterlySpend += client.getQuarterlyBudget();

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println("\n\n"+ client.getId() +"client.getContractStart().plus(client.getContractLength(): " +
                    client.getContractStart().plus(client.getContractLength()));
            if (nextExpiration != null)System.out.println(nextExpiration.getId() +"nextExpiration.getContractStart().plus(nextExpiration" +
                    ".getContractLength(): " + nextExpiration.getContractStart().plus(nextExpiration.getContractLength()));
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (nextExpiration == null || client.getContractStart().plus(client.getContractLength())
                    .isAfter(nextExpiration.getContractStart().plus(nextExpiration.getContractLength()))) {
                nextExpiration = client;
            }
            for (ZoneId zone : client.getTimeZones()) {
                representedZoneIds.add(zone);
            }
            contractsPerYear.compute(getContractYear(client), (k, v) -> (v == null) ? 1 : v + 1);
        }


        List<UdacisearchClient> lstClients = ClientStore.getClients();

//        numClients = (int)(lstClients.stream().count());
//
//
//
//        totalQuarterlySpend = lstClients.stream()
//                .mapToInt(UdacisearchClient::getQuarterlyBudget)
//                .sum();
//
//        double avgBudget=lstClients.stream()
//                .mapToInt(UdacisearchClient::getQuarterlyBudget)
//                .mapToDouble(d -> d)
//                .average()
//                .orElse(0.0);

           // nextExpiration = lstClients.stream()
        representedZoneIds = lstClients.stream()
                        .map(x->UdacisearchClient.getTimeZones()).collect(Collectors.toSet());




        System.out.println("Num lstClients: " + numClients);
        System.out.println("Total quarterly spend: " + totalQuarterlySpend);
        System.out.println("Average budget: " + (double) totalQuarterlySpend / numClients);
        System.out.println("ID of next expiring contract: " + (nextExpiration == null ? -1 : nextExpiration.getId()));
        System.out.println("Client time zones: " + representedZoneIds);
        System.out.println("Contracts per year: " + contractsPerYear);
    }

    private static Year getContractYear(UdacisearchClient client) {
        LocalDate contractDate =
                LocalDate.ofInstant(client.getContractStart(), client.getTimeZones().get(0));
        return Year.of(contractDate.getYear());
    }
}