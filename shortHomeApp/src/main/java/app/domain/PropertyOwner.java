package app.domain;

public class PropertyOwner extends Person {
    private String OwnerType;

    public String getOwnerType() {
        return OwnerType;
    }

    public void setOwnerType(String ownerType) {
        OwnerType = ownerType;
    }

    @Override
    public void create() {
        super.create();
    }

    @Override
    public void selectAll() {
        super.selectAll();
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void delete(int id) {
        super.delete(id);
    }

    @Override
    public void selectById(int id) {
        super.selectById(id);
    }
}
