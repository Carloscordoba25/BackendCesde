package app.service;

import app.domain.PropertyOwner;
import app.domain.enums.DocumentsTypeEnum;
import app.domain.enums.OwnerTypeEnum;

import java.sql.Date;

public class propertyOwnerService {

    public PropertyOwner createPropertyOwner(int id, String docType, String name, String lastName, String phone, String email, String address, String password, String birthDay, OwnerTypeEnum ownerType){
        PropertyOwner propertyOwner = new PropertyOwner( id, docType,  name,  lastName,  phone,  email,  address,  password,  Date.brithDay, OwnerTypeEnum.valueOf(ownerType));
        return null;




    }
}
