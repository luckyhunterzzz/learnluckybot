import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println(PhrasesToText.greetings);
        System.out.println(PhrasesToText.choose);

        int userSetNumber = 0;

        while (true) {
            String userText = scanner.nextLine();
            if (userText.equalsIgnoreCase("1")) {
                System.out.printf(PhrasesToText.greatChoose, PhrasesToText.GLAGOL, Glagoly.getWordSize());

                while (true) {
                    userSetNumber = scanner.nextInt();
                    if (userSetNumber < 3 || userSetNumber > Glagoly.getWordSize()) {
                        System.out.println("Введи корректное число");
                    } else {
                        break;
                    }
                }

                int count = 0;
                int countMistakes = 0;
                String userAnswer;

                while (userSetNumber != count) {
                    String[] randomWord = Glagoly.getRandomWord();
                    System.out.println(PhrasesToText.translateText + randomWord[0]);

                    userAnswer = scanner.nextLine();
                    String[] userAnswerArray = userAnswer.split(" ");
                    Thread.sleep(700);

                    if (!userAnswer.isEmpty()) {
                        if (Glagoly.compareOfWord(randomWord, userAnswerArray)) {
                            System.out.println("Верно!");
                            count++;
                        } else {
                            System.out.print("Ошибка! Правильный ответ: ");
                            for (int i = 1; i < randomWord.length; i++) {
                                System.out.print(randomWord[i] + " ");
                            }
                            System.out.println();
                            count++;
                            countMistakes++;
                        }
                    } else {
                        System.out.print("Пример: ");
                        for (int i = 1; i < randomWord.length; i++) {
                            System.out.print(randomWord[i] + " ");
                        }
                        System.out.println();
                    }
                }
                System.out.printf(PhrasesToText.greatJob, PhrasesToText.GLAGOL, count, countMistakes);
                System.out.println("\n___________________________________________\n" +
                        PhrasesToText.choose + "\n___________________________________________");

            } else if (userText.equalsIgnoreCase("2")) {
                System.out.printf(PhrasesToText.greatChoose, PhrasesToText.SUSHES, Sushes.getWordSize());
                while (true) {
                    userSetNumber = scanner.nextInt();
                    if (userSetNumber < 3 || userSetNumber > Sushes.getWordSize()) {
                        System.out.println("Введи корректное число");
                    } else {
                        break;
                    }
                }

                int count = 0;
                int countMistakes = 0;
                String userAnswer;

                while (userSetNumber != count) {
                    String[] randomWord = Sushes.getRandomWord();
                    System.out.println(PhrasesToText.translateText + randomWord[0]);

                    userAnswer = scanner.nextLine();
                    String[] userAnswerArray = userAnswer.split(" ");
                    Thread.sleep(700);

                    if (!userAnswer.isEmpty()) {
                        if (Sushes.compareOfWord(randomWord, userAnswerArray)) {
                            System.out.println("Верно!");
                            count++;
                        } else {
                            System.out.print("Ошибка! Правильный ответ: ");
                            for (int i = 1; i < randomWord.length; i++) {
                                System.out.print(randomWord[i] + " ");
                            }
                            System.out.println();
                            count++;
                            countMistakes++;
                        }
                    } else {
                        System.out.print("Пример: ");
                        for (int i = 1; i < randomWord.length; i++) {
                            System.out.print(randomWord[i] + " ");
                        }
                        System.out.println();
                    }
                }
                System.out.printf(PhrasesToText.greatJob, PhrasesToText.SUSHES, count, countMistakes);
                System.out.println("\n___________________________________________\n" +
                        PhrasesToText.choose + "\n___________________________________________");

            } else if (userText.equalsIgnoreCase("3")) {
                System.out.printf(PhrasesToText.greatChoose, PhrasesToText.NARECH, Narech.getWordSize());

                while (true ) {
                    userSetNumber = Integer.parseInt(scanner.nextLine());
                    if (userSetNumber >= 3 && userSetNumber <= Narech.getWordSize()) {
                        break;
                    } else {
                        System.out.println("Введи корректное число");
                    }
                }

                int count = 0;
                int countMistakes = 0;
                String userAnswer;

                while (userSetNumber != count) {
                    String[] randomWord = Narech.getRandomWord();
                    System.out.println(PhrasesToText.translateText + randomWord[0]);

                    userAnswer = scanner.nextLine();
                    String[] userAnswerArray = userAnswer.split(" ");
                    Thread.sleep(700);

                    if (!userAnswer.isEmpty()) {
                        if (Narech.compareOfWord(randomWord, userAnswerArray)) {
                            System.out.println("Верно!");
                            count++;
                        } else if (userAnswer.equalsIgnoreCase("exit")){
                            break;
                        } else {
                            System.out.print("Ошибка! Правильный ответ: ");
                            for (int i = 1; i < randomWord.length; i++) {
                                System.out.print(randomWord[i] + " ");
                            }
                            System.out.println();
                            count++;
                            countMistakes++;
                        }
                    } else {
                        System.out.print("Пример: ");
                        for (int i = 1; i < randomWord.length; i++) {
                            System.out.print(randomWord[i] + " ");
                        }
                        System.out.println();
                    }
                }
                System.out.printf(PhrasesToText.greatJob, PhrasesToText.NARECH, count, countMistakes);
                System.out.println("\n___________________________________________\n" +
                        PhrasesToText.choose + "\n___________________________________________");
            } else if (userText.equalsIgnoreCase("4")) {
                System.out.printf(PhrasesToText.greatChoose, PhrasesToText.PHRASES, Phrases.getWordSize());
                while (true) {
                    userSetNumber = scanner.nextInt();
                    if (userSetNumber < 3 || userSetNumber > Phrases.getWordSize()) {
                        System.out.println("Введи корректное число");
                    } else {
                        break;
                    }
                }

                int count = 0;
                int countMistakes = 0;
                String userAnswer;

                while (userSetNumber != count) {
                    String[] randomWord = Phrases.getRandomWord();
                    System.out.println(PhrasesToText.translateText + randomWord[0]);

                    userAnswer = scanner.nextLine();
                    String[] userAnswerArray = userAnswer.split(" ");
                    Thread.sleep(700);

                    if (!userAnswer.isEmpty()) {
                        if (Phrases.compareOfWord(randomWord, userAnswerArray)) {
                            System.out.println("Верно!");
                            count++;
                        } else {
                            System.out.print("Ошибка! Правильный ответ: ");
                            for (int i = 1; i < randomWord.length; i++) {
                                System.out.print(randomWord[i] + " ");
                            }
                            System.out.println();
                            count++;
                            countMistakes++;
                        }
                    } else {
                        System.out.print("Пример: ");
                        for (int i = 1; i < randomWord.length; i++) {
                            System.out.print(randomWord[i] + " ");
                        }
                        System.out.println();
                    }
                }
                System.out.printf(PhrasesToText.greatJob, PhrasesToText.PHRASES, count, countMistakes);
                System.out.println("\n___________________________________________\n" +
                        PhrasesToText.choose + "\n___________________________________________");
            } else if (userText.equalsIgnoreCase("5")) {
                System.out.printf(PhrasesToText.greatChoose, PhrasesToText.MESTOIM, Mestoim.getWordSize());
                while (true) {
                    userSetNumber = scanner.nextInt();
                    if (userSetNumber < 3 || userSetNumber > Mestoim.getWordSize()) {
                        System.out.println("Введи корректное число");
                    } else {
                        break;
                    }
                }

                int count = 0;
                int countMistakes = 0;
                String userAnswer;

                while (userSetNumber != count) {
                    String[] randomWord = Mestoim.getRandomWord();
                    System.out.println(PhrasesToText.translateText + randomWord[0]);

                    userAnswer = scanner.nextLine();
                    String[] userAnswerArray = userAnswer.split(" ");
                    Thread.sleep(700);

                    if (!userAnswer.isEmpty()) {
                        if (Mestoim.compareOfWord(randomWord, userAnswerArray)) {
                            System.out.println("Верно!");
                            count++;
                        } else {
                            System.out.print("Ошибка! Правильный ответ: ");
                            for (int i = 1; i < randomWord.length; i++) {
                                System.out.print(randomWord[i] + " ");
                            }
                            System.out.println();
                            count++;
                            countMistakes++;
                        }
                    } else {
                        System.out.print("Пример: ");
                        for (int i = 1; i < randomWord.length; i++) {
                            System.out.print(randomWord[i] + " ");
                        }
                        System.out.println();
                    }
                }
                System.out.printf(PhrasesToText.greatJob, PhrasesToText.MESTOIM, count, countMistakes);
                System.out.println("\n___________________________________________\n" +
                        PhrasesToText.choose + "\n___________________________________________");
            } else if (userText.equalsIgnoreCase("6")) {
                System.out.printf(PhrasesToText.greatChoose, PhrasesToText.ALLWORDS, AllWords.getWordSize());
                while (true) {
                    userSetNumber = scanner.nextInt();
                    if (userSetNumber < 3 || userSetNumber > AllWords.getWordSize()) {
                        System.out.println("Введи корректное число");
                    } else {
                        break;
                    }
                }

                int count = 0;
                int countMistakes = 0;
                String userAnswer;

                while (userSetNumber != count) {
                    String[] randomWord = AllWords.getRandomWord();
                    System.out.println(PhrasesToText.translateText + randomWord[0]);

                    userAnswer = scanner.nextLine();
                    String[] userAnswerArray = userAnswer.split(" ");
                    Thread.sleep(700);

                    if (!userAnswer.isEmpty()) {
                        if (AllWords.compareOfWord(randomWord, userAnswerArray)) {
                            System.out.println("Верно!");
                            count++;
                        } else {
                            System.out.print("Ошибка! Правильный ответ: ");
                            for (int i = 1; i < randomWord.length; i++) {
                                System.out.print(randomWord[i] + " ");
                            }
                            System.out.println();
                            count++;
                            countMistakes++;
                        }
                    } else {
                        System.out.print("Пример: ");
                        for (int i = 1; i < randomWord.length; i++) {
                            System.out.print(randomWord[i] + " ");
                        }
                        System.out.println();
                    }
                }
                System.out.printf(PhrasesToText.greatJob, PhrasesToText.ALLWORDS, count, countMistakes);
                System.out.println("\n___________________________________________\n" +
                        PhrasesToText.choose + "\n___________________________________________");
            } else if (userText.equalsIgnoreCase("exit")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Для дальнейшей работы необходимо выбрать корректный вариант");
            }
        }
    }
}