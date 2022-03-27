package bean;

import java.io.Serializable;

public class Word implements Serializable {

    //id
    private long id;
    //名字
    private String name;
    //大写前缀
    private String prefix;
    //长度
    private int length;

    public Word(long id, String name) {
        this.id = id;
        this.name = name;
        this.prefix = name.substring(0,1).toUpperCase();
        this.length = name.length();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                ", length=" + length +
                '}';
    }
}
