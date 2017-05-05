package ru.job4j.items;

import java.util.Arrays;

/**
 * Created by pro on 01.05.2017.
 */
public class Item {
    /**
    * Item id.
    */
    private String id;
    /**
    * Item name.
    */
    private String name;
    /**
    * Item description.
    */
    private String desc;
    /**
    * Date of creation item.
    */
    private long created;
    /**
    * Item comment.
    */
    private String[] comments;

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", created=" + created +
                ", comments=" + Arrays.toString(comments) +
                '}';
    }

    /**
     * Contructor of item.
     * @param id - id of item
     * @param name - name of item
     * @param desc - description of item
     * @param created - data of created
     * @param comments - comments of item
     */
    public Item(String id, String name, String desc, long created, String[] comments) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.created = created;
        this.comments = comments;
    }

    /**
     * Method to get id.
     * @return id of item
     */
    public String getId() {
        return id;
    }
    /**
     * Method to set id.
     * @param id - id of item
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Method to get name.
     * @return name of item
     */
    public String getName() {
        return name;
    }
    /**
     * Method to set name.
     * @param name - name of item
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method to get description.
     * @return description of item
     */
    public String getDesc() {
        return desc;
    }
    /**
     * Method to set description.
     * @param desc - description of item
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    /**
     * Method to get data of created.
     * @return data of created
     */
    public long getCreated() {
        return created;
    }
    /**
     * Method to set data of created.
     * @param created - data of created
     */
    public void setCreated(long created) {
        this.created = created;
    }
    /**
     * Method to get comments.
     * @return comments of item
     */
    public String[] getComments() {
        return comments;
    }
    /**
     * Method to set comments.
     * @param comments - comments of item
     */
    public void setComments(String[] comments) {
        this.comments = comments;
    }
}
