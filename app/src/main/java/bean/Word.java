package bean;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Word implements Serializable {

    //id
    @PrimaryKey(autoGenerate = true)
    private int id;
    //名字
    @ColumnInfo(name = "name")
    private String name;
    //大写前缀
    @ColumnInfo(name = "prefix")
    private String prefix;
    //长度
    @ColumnInfo(name = "length")
    private int length;

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                ", length=" + length +
                ", frequency=" + frequency +
                '}';
    }

    //词频
    @ColumnInfo(name = "frequency")
    private int frequency;

    public Word(String name) {
        this.name = name;
        this.prefix = name.substring(0,1).toUpperCase();
        this.length = name.length();
        this.frequency = 0;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

}
