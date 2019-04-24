package observer;

class Boos extends Subject {
    private String state;

    Boos(String state){
        this.state = state;
    }

    String getState() {
        return state;
    }

     void setState(String state) {
        this.state = state;
    }
}
