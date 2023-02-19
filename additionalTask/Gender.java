public enum Gender {
    MALE,
    FAMALE;

    static Gender getGender(String gender) {
        if (gender.equals("мужчина")) {
            return Gender.MALE;
        } else if (gender.equals("женщина")) {
            return Gender.FAMALE;
        } else {
            System.out.println("Введено неверное значение! Пол будет задан по умолчанию \"null\"");
            return null;
        }
    }
}