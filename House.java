class House {

    private String houseAddress;

    // Конструктор
    House(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    // Внутренний класс
    class Room {
        private String roomIdentifier;

        // Конструктор
        Room(String roomIdentifier) {
            this.roomIdentifier = roomIdentifier;
        }

        void printAddresses() {
            System.out.println(this.roomIdentifier);
            System.out.println(House.this.houseAddress);
        }
    }
}
