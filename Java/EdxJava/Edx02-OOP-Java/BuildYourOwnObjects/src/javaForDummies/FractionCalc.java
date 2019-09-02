package javaForDummies;

import java.util.Scanner;

public class FractionCalc {
    public static void main(String[] args) {
        System.out.println("This Program is a fraction calculator.");
        System.out.println("It will add, subtract, multiply and divide fractions until you enter Q.");
        System.out.println("Please enter your fractions in the form a/b, where a and b are integers");
        System.out.println("--------------------------------------------------------------------------");

        Scanner userEntry = new Scanner(System.in);
        String artOperation = getOperation(userEntry);
        Scanner userNumber1 = new Scanner(System.in);
        Fraction object1 = getFraction(userNumber1);
        Scanner userNumber2 = new Scanner(System.in);
        Fraction object2 = getFraction(userNumber2);

        if (artOperation.equals("+")) {
            object1.add(object2);
            System.out.println(object1.add(object2));
            System.out.println("--------------------------------------------------------------------------");
        } else if (artOperation.equals("-")) {
            object1.subtract(object2);
            System.out.println(object1.subtract(object2));
            System.out.println("--------------------------------------------------------------------------");
        } else if (artOperation.equals("*")) {
            object1.multiply(object2);
            System.out.println(object1.multiply(object2));
            System.out.println("--------------------------------------------------------------------------");
        } else if (artOperation.equals("/")) {
            object1.divide(object2);
            System.out.println(object1.divide(object2));
            System.out.println("--------------------------------------------------------------------------");
        } else if (artOperation.equals("q")) {
            System.exit(1);
        }

        public static String getOperation (Scanner input){
            System.out.print("Please enter an operation (+,-,*,/,= or Q to quit): ");
            String inputReturn = input.next();

            while (!(inputReturn.equals("-") || inputReturn.equals("+") || inputReturn.equals("*") || inputReturn.equals("/") || inputReturn.equals("=") || inputReturn.equalsIgnoreCase("Q"))) {
                System.out.print("Invalid input (+,-,*,/,= or Q to quit): ");
                inputReturn = input.next();
            }
            return inputReturn;
        }
        public static boolean validFraction (String input){
            boolean approvedNumber = true;
            // if the "/" is counted 0 or one
            int countSlash = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '/') {
                    countSlash++;
                }
            }
            if (countSlash > 1) {
                approvedNumber = false;
            } else if (input.matches("\\p{Alpha}")) {
                approvedNumber = false;
            } else if (input.matches("\\s+")) {
                approvedNumber = false;
            } else if (input.equals("/")) {
                approvedNumber = false;
            } else if ((countSlash == 1) && (input.contains("/"))) {
                // before we split the string we have to handle inputs like 5/ or /5 are handled
                // but works for test case if the fraction has one or more space character like 4  /2
                // which is should not ||input.matches("\\p{Space}")
                if (input.indexOf('/') != input.length() - 1 && input.indexOf('/') != 0) {
                    String[] disectString = input.split("/");
                    String numeratorPart = disectString[0];
                    String denominatorPart = disectString[1];

                    if (numeratorPart.length() > 0 && denominatorPart.length() > 0) {
                        if (numeratorPart.startsWith("-") && denominatorPart.startsWith("-")) {
                            String noSignNumerator1 = numeratorPart.substring(1, numeratorPart.length());
                            String noSignDenominator1 = numeratorPart.substring(1, denominatorPart.length());
                            if (noSignNumerator1.matches("\\p{Digit}") && noSignDenominator1.matches("\\p{Digit}")) {
                                if (noSignDenominator1.equals("0")) {
                                    approvedNumber = false;
                                } else {
                                    approvedNumber = true;
                                }

                            } else {
                                approvedNumber = false;
                            }
                        } else if (numeratorPart.startsWith("-")) {
                            String noSignNumerator2 = numeratorPart.substring(1, numeratorPart.length());

                            if (noSignNumerator2.matches("\\p{Digit}") || denominatorPart.matches("\\p{Digit}")) {
                                if (denominatorPart.equals("0")) {
                                    approvedNumber = false;
                                } else {
                                    approvedNumber = true;
                                }
                            } else {
                                approvedNumber = false;
                            }
                        } else if (denominatorPart.startsWith("-")) {
                            String noSignDenominator3 = numeratorPart.substring(1, denominatorPart.length() - 1);
                            if (noSignDenominator3.matches("\\p{Digit}") || numeratorPart.matches("\\p{Digit}")) {
                                if (noSignDenominator3.equals("0")) {
                                    approvedNumber = false;
                                } else {
                                    approvedNumber = true;
                                }
                            } else {
                                approvedNumber = false;
                            }
                        } else {
                            String noSignNumerator4 = numeratorPart.substring(0, numeratorPart.length());
                            String noSignDenominator4 = numeratorPart.substring(0, denominatorPart.length());
                            if (noSignNumerator4.matches("\\p{Digit}") && noSignDenominator4.matches("\\p{Digit}")) {
                                if (noSignDenominator4.equals("0")) {
                                    approvedNumber = false;
                                } else {
                                    approvedNumber = true;
                                }

                            } else {
                                approvedNumber = false;
                            }
                        }
                    } else {
                        approvedNumber = false;
                    }
                } else {
                    approvedNumber = false;
                }
            } else if (countSlash == 0) {
                if (input.startsWith("-")) {
                    String noSignInteger = input.substring(1, input.length());
                    if (noSignInteger.matches("\\p{Digit}")) {
                        approvedNumber = true;
                    } else {
                        approvedNumber = false;
                    }
                } else if (input.matches("\\p{Digit}")) {
                    approvedNumber = true;
                } else {
                    approvedNumber = false;
                }
            }
            return approvedNumber;
        }
        public static Fraction getFraction (Scanner input){
            System.out.print("Please enter a fraction (a/b) or  integer(a): ");
            String userFraction = input.nextline();
            boolean isValid = validFraction(userFraction);
            Fraction aFraction = new Fraction();

            while (isValid == false) {
                System.out.println("Invalid fraction. Please enter a fraction (a/b) or integer (a), where a and b are integers and b is not zero:  ");
                userFraction = input.nextLine();
                isValid = validFraction(userFraction);
            }

            if (isValid == true) {
                if (userFraction.contains("/")) {
                    String[] splitString = userFraction.split("/");
                    int intNumerator = Integer.parseInt(splitString[0]);
                    int intDenominator = Integer.parseInt(splitString[1]);
                    //string successfully dissected and passed as numerator and denominator
                    aFraction = new Fraction(intNumerator, intDenominator);
                } else {
                    // string is only one and is numerator
                    int intNumerator = Integer.parseInt(userFraction);
                    aFraction = new Fraction(intNumerator);
                }

            }
            return aFraction;
        }
    }
}
