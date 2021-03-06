package student_lilija_g.homework.lesson_7.level_6_middle.task_12;
/*
Написать программу, которая определяет, является ли строка палиндромом.
Палиндром - это буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
Иногда палиндромом называют любой симметричный относительно своей середины набор символов,
например: "racecar", "level", "sum summus mus", "А роза упала на лапу Азора".

Создать класс Palindrome, который реализует следующий метод:

boolean isPalindrome(String text) - метод возвращает true, если строка является палиндромом, в противном случае false;

Ограничения:
- Логику проверки необходимо реализовать при помощи массивов;
- Знаки препинания и регистр при проверке необходимо игнорировать (Le,VEl = level);

Написать тестовые сценарии для класса Palindrome в классе PalindromeTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Palindrome {

    boolean isPalindrome(String text){
        String newText = textOnlyCharacters(text).toLowerCase();
        int i = 0, j = newText.length() - 1;
        while (i < j) {
            if (newText.charAt(i) != newText.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public String textOnlyCharacters(String text) {
        return text.replaceAll("[^a-zA-Z]", "");
    }

}
