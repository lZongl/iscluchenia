import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*Задача:
Напишите программу, которая:
1. Запрашивает у пользователя ввод 5 строк, которые будут храниться в массиве.
2. Использует блок try-catch, чтобы:
Поймать ArrayIndexOutOfBoundsException, если пользователь пытается получить доступ к элементу массива, который не существует.
Поймать NullPointerException, если пользователь вводит пустую строку (например, пытается вывести длину пустой строки).
3. В конце программы, в блоке finally, выводит сообщение "Обработка завершена", которое должно выводиться всегда.
4. Программа должна выводить длины введенных строк, если они не пустые, и выводить сообщение "Строка пустая" для пустых строк.

 */

        String []str = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку"); //решил на уроке
        try {
            String stringOne = scanner.next();
            str[0] = stringOne;
            if(stringOne.length()==0){
                throw new NullPointerException("Строка пуста"); //прокидывание ошибки (создание искуственное ошибки)
            }else System.out.println("Длина вашей строки "+stringOne.length()+ " символов");
        }catch (ArrayIndexOutOfBoundsException e){
                System.out.printf("Ошибка ArrayIndexOutOfBoundsException");
        }catch (NullPointerException e){
                System.out.printf("Ошибка NullPointerException");
        }finally {
            System.out.printf("Обработка завершена"+ "\n");
        }
        System.out.println("Введите вторую строку"); //решил на уроке
        try {
            String stringTwo = scanner.next();
            str[1] = stringTwo;
            if(stringTwo.length()==0){
                throw new NullPointerException("Строка пуста");
            }else System.out.println("Длина вашей строки "+stringTwo.length()+ " символов");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("Ошибка ArrayIndexOutOfBoundsException");

        }catch (NullPointerException e){
            System.out.printf("Ошибка NullPointerException"); //решил на уроке
        }finally {
            System.out.printf("Обработка завершена"+"\n");
        }
        System.out.println("Введите третюю строку");
        try {
            String stringThree = scanner.next();
            str[2] = stringThree; //решил на уроке
            if(stringThree.length()==0){
                throw new NullPointerException("Строка пуста");
            }else System.out.println("Длина вашей строки "+stringThree.length()+ " символов"); //решил на уроке
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("Ошибка ArrayIndexOutOfBoundsException");
        }catch (NullPointerException e){
            System.out.printf("Ошибка NullPointerException");
        }finally {
            System.out.printf("Обработка завершена"+"\n"); //решил на уроке
        }
        System.out.println("Введите четвертую строку");
        try {
            String stringFour = scanner.next();
            str[3] = stringFour;
            if(stringFour.length()==0){
                throw new NullPointerException("Строка пуста"); //решил на уроке
            }else System.out.println("Длина вашей строки "+stringFour.length()+ " символов");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("Ошибка ArrayIndexOutOfBoundsException");
        }catch (NullPointerException e){
            System.out.printf("Ошибка NullPointerException");
        }finally { //решил на уроке
            System.out.printf("Обработка завершена"+"\n");
        }
        System.out.println("Введите пятую строку"); //решил на уроке
        try {
            String stringFive = scanner.next();
            str[4] = stringFive; //решил на уроке
            if(stringFive.length()==0){
                throw new NullPointerException("Строка пуста");
            }else System.out.println("Длина вашей строки "+stringFive.length()+ " символов");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("Ошибка ArrayIndexOutOfBoundsException");
        }catch (NullPointerException e){
            System.out.printf("Ошибка NullPointerException"); //решил на уроке
        }finally {
            System.out.printf("Обработка завершена"+"\n");
        }
        scanner.close();
        System.exit(0); //принудительное завершение программы через команду
        }
    }
