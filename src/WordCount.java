public class WordCount {
    String word;
    int count;

    public WordCount(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public void setWord(String word) {
        this.word = word;
    }
    public String getWord(){
        return word;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getCount(){
        return count;
    }

}

