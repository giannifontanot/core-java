package com.UD_Streams_Exercise;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.*;

public final class SummarizeClients {
    public static void main(String[] args) {

        int numClients = 0;
        UdacisearchClient nextExpiration = null;
        Set<ZoneId> representedZoneIds = new HashSet<>();
        Map<Year, Integer> contractsPerYear = new HashMap<>();

        for (UdacisearchClient client : ClientStore.getClients()) {
            numClients++;
            if (nextExpiration == null || client.getContractStart().plus(client.getContractLength())
                    .isAfter(nextExpiration.getContractStart().plus(nextExpiration.getContractLength()))) {
                nextExpiration = client;
            }
            for (ZoneId zone : client.getTimeZones()) {
                representedZoneIds.add(zone);
            }
            contractsPerYear.compute(getContractYear(client), (k, v) -> (v == null) ? 1 : v + 1);
        }

        List<UdacisearchClient> clients = ClientStore.getClients();
        int totalQuarterlySpend = clients.stream()
                        .mapToInt(UdacisearchClient::getQuarterlyBudget)
                        .sum();

        System.out.println("Num clients: " + numClients);
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
