package cn.edu.bupt.byrclient.model;

/**
 * Created by Administrator on 2015/7/30 0030.
 */
public class Section {
    private int name;
    private String description;
    private boolean is_root;
    private String parent;

    public Section(int name, String description, boolean is_root, String parent) {
        this.name = name;
        this.description = description;
        this.is_root = is_root;
        this.parent = parent;
    }

    public int getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getParent() {
        return parent;
    }

    public boolean is_root() {
        return is_root;
    }

    @Override
    public String toString() {
        return "name:" + name + "desc:" + description + "is_root:" + is_root;
    }
}