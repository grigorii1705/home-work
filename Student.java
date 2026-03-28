class Student {
    int studentGrade = 1;

    // Первый блок
    {
        System.out.println("Блок 1: grade = " + studentGrade);
        studentGrade = 5;
    }

    // Второй блок
    {
        System.out.println("Блок 2: grade = " + studentGrade);
    }
}

