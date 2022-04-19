package com.example.project_login;

public class Description {

    public String codeName, description;
    private boolean expandable;

    public Description(String codeName, String description){
        this.codeName = codeName;
        this.description = description;
        this.expandable = false;

    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(){
        this.description = description;
    }

    @Override
    public String toString() {
        return "Description{" +
                "codeName='" + codeName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
