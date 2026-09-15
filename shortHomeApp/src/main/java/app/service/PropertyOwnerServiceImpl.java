package app.service;

import app.domain.PropertyOwner;
import app.repository.PropertyRepository;

import java.util.Date;

public class PropertyOwnerServiceImpl {

private final PropertyRepository propertyRepository;

PropertyOwnerServiceImpl(PropertyRepository propertyRepository){
    this.propertyRepository = propertyRepository;
}

public PropertyOwner create(int DocumentsType, String name, String lastname, String phone, String address, String mail, String password, Date birthday, String OwnerType){
    PropertyOwner propertyOwner = new PropertyOwner (DocumentsType,name, lastname, phone, address, mail, password,birthday, OwnerType);

    return PropertyRepository(PropertyOwner)

}
}
