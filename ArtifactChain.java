public class ArtifactChain {

    // голова списка
    private Link head;

    // статический вложенный класс (узел)
    private static class Link {
        int value;
        Link next;

        Link(int value) {
            this.value = value;
        }
    }

    // добавление в начало
    void addArtifact(int artifactValue) {
        Link newLink = new Link(artifactValue);
        newLink.next = head;
        head = newLink;
    }

    // вывод цепочки
    void displayChain() {
        Link current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ArtifactChain chain = new ArtifactChain();

        chain.addArtifact(5);
        chain.addArtifact(10);
        chain.addArtifact(15);

        chain.displayChain(); // 15, 10, 5
    }
}
