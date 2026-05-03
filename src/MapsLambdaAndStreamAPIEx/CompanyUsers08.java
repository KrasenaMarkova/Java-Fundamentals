package MapsLambdaAndStreamAPIEx;

import java.util.*;
//Write a program which keeps the information about companies and their employees.
//You will receive company names and an employees' id until you receive the "End" command.
// Add each employee to the given company. Keep in mind that a company cannot have two employees with the same id.
//Print the company name and each employee's id in the following format:
//"{company_name}-- {id1}-- {id2}-- {idN}"
//Input / Constraints
//•	Until you receive "End", the input come in the format: "{companyName} -> {employeeId}".
//•	The input always will be valid.

public class CompanyUsers08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> listOfEmployees = new LinkedHashMap<>();

        while (!command.equals("End")) {
            String[] data = command.split(" -> ");

            List<String> currentCompanyEmployees = listOfEmployees.get(data[0]);
            boolean containsId = currentCompanyEmployees != null && currentCompanyEmployees.contains(data[1]);

            if (!containsId) {
                listOfEmployees.putIfAbsent(data[0], new ArrayList<>());
                listOfEmployees.get(data[0]).add(data[1]);
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : listOfEmployees.entrySet()) {
            System.out.printf("%s\n", entry.getKey());
            entry.getValue().forEach(id -> System.out.printf("-- %s\n", id));
        }
    }
}
