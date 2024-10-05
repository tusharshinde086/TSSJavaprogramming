package ass11;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

    class Customer {
        private int cId;
        private String cname;
        private String address;
        private String mobileNo;

        public Customer(int cId, String cname, String address, String mobileNo) {
            this.cId = cId;
            this.cname = cname;
            this.address = address;
            this.mobileNo = mobileNo;
        }

        public int getCId() {
            return cId;
        }

        public String getCname() {
            return cname;
        }

        public String getAddress() {
            return address;
        }

        public String getMobileNo() {
            return mobileNo;
        }
    }

public class CustomerDetails {
        public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number of customers: ");
            int n = 0;

            try {
                n = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Error reading input: " + e.getMessage());
                return;
            }

            Customer[] customers = new Customer[n];

            // Accept details for each customer
            for (int i = 0; i < n; i++) {
                try {
                    System.out.println("Enter details for customer " + (i + 1) + ":");

                    System.out.print("Customer ID: ");
                    int cId = Integer.parseInt(reader.readLine());

                    System.out.print("Customer Name: ");
                    String cname = reader.readLine();

                    System.out.print("Address: ");
                    String address = reader.readLine();

                    System.out.print("Mobile No: ");
                    String mobileNo = reader.readLine();

                    customers[i] = new Customer(cId, cname, address, mobileNo);
                } catch (IOException e) {
                    System.out.println("Error reading input: " + e.getMessage());
                }
            }

            // Write customer details to a file
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("customers.dat"))) {
                for (Customer customer : customers) {
                    dos.writeInt(customer.getCId());
                    dos.writeUTF(customer.getCname());
                    dos.writeUTF(customer.getAddress());
                    dos.writeUTF(customer.getMobileNo());
                }
                System.out.println("Customer details saved to customers.dat");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }
    }
