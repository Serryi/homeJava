    public static void main(String[] args) {
        phoneBook phoneBook = new phoneBook();
        phoneBook.add("123886789", "Костик");
        phoneBook.add("3578641954", "Малмыгина");
        phoneBook.add("789512447", "Вован");
        phoneBook.add("328947661", "Робот");
        phoneBook.add("127895578", "Зяба");
        phoneBook.add("666999111", "Крот");
        phoneBook.add("412365874", "Штоквайнер");
        phoneBook.add("123456789", "Костик");
        phoneBook.add("1234567777", "Штоквайнер");
        System.out.println(phoneBook.getAll());
    }
}
