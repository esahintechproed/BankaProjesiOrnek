package com.bankaprojesi.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WriteToTxt {
    /*

    public static void saveDataInFileWithSSN(String fileName, Customer[] customers) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length; i++)
                writer.append(customers[i].getSsn() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFileWithSSN(String fileName, Applicants[] applicants) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < applicants.length; i++)
                writer.append(applicants[i].getSsn() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }


   /* public static void saveDataInFileAllCustomersInfo(String fileName, Customer5[] customer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customer.length; i++) {
                writer.append(customer[i].getId() + " , " + customer[i].getFirstName() + " , " + customer[i].getLastName() + " , " + customer[i].getSsn() + "\n");
                if (customer[i].getUser() != null) {
                    writer.append(customer[i].getUser().getFirstName() + " , " + customer[i].getUser().getLastName() + "\n");
                }
                if (customer[i].getCountry() != null) {
                    writer.append(customer[i].getCountry().getName() + " , " + customer[i].getCountry().getState() + "\n");
                }
            }
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFileSsn(String fileName, Customer5 customer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(customer.getSsn());
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveAllStates2(String fileName, States[] states) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < states.length; i++) {
                writer.append(states[i].getName() + "," + states[i].getTpcountry() + "\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFileWithJsonListMap(String fileName, List<Map<String, Object>> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < json.size(); i++) {
                writer.append(json.get(i).get("id") + " , " + json.get(i).get("name") + " , " + json.get(i).get("states") + "\n");
            }

            writer.close();
        } catch (Exception e) {

        }
    }

    public static void saveDataInFileWithJsonListMapState(String fileName, List<Map<String, Object>> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < json.size(); i++) {
                writer.append(json.get(i).get("id") + " , " + json.get(i).get("name") + " , " + json.get(i).get("tpcountry") + "\n");
            }

            writer.close();
        } catch (Exception e) {

        }
    }

    public static void saveDataInFile2(String fileName, Customer5[] customers) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length; i++)

                writer.append(customers[i].getSsn() + ",\n");

            writer.close();
        } catch (Exception e) {

        }
    }

    public static void saveDataInFileWithAllCustomerInfo2(String fileName, Customer5[] customers) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));


            for (int i = 0; i < customers.length; i++) {

                writer.append(customers[i].getFirstName() + ", " + customers[i].getLastName() + ", " + customers[i].getEmail() + ", " + customers[i].getSsn() + "\n");
                if (customers[i].getUser() != null)
                    writer.append(customers[i].getUser().getFirstName());
                if (customers[i].getCountry() != null)
                    writer.append(customers[i].getCountry().getName());

            }

            writer.close();
        } catch (Exception e) {

        }
    }

    public static void saveAllStates(String fileName, States[] states)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i=0; i<states.length; i++)
                writer.append(states[i].getName()+" , "+states[i].getId()+"\n");

            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveAllCustomers(String fileName, Customer5[] customers){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for(int i = 0; i<customers.length; i++){
                writer.append(customers[i].getSsn() + ", " + customers[i].getFirstName() + ", ");
                if(customers[i].getCountry() != null){
                    writer.append(customers[i].getCountry().getName() + ", " + customers[i].getCountry().getId() + ",\n");
                }else{
                    writer.append("\n");
                }
            }
            writer.close();
        } catch (Exception e) {

        }

    }


    public static List<String> saveDataInFileWithCountryNamesAndReadNamesReturnList(String fileName, Country3[] countries) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < countries.length; i++)
                writer.append(countries[i].getName() + "\n");
            writer.close();
        } catch (Exception e) {
        }

        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int i = 0;
            while (line != null) {
                Country3 country = new Country3();
                country.setName(line.split(", ")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                i++;
                all.add(country.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }




    public static void saveDataInFileWithStateid(String fileName, States[] sstates)


    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < sstates.length; i++)
                writer.append(sstates[i].getId() + "\n");
            writer.close();
        } catch (Exception e) {
        }


    }
    */

}
