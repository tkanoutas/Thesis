package com.sun.s1asdev.jdbc.simpleora.ejb;

import javax.ejb.*;
import java.rmi.*;

public interface SimpleBMPHome
    extends EJBHome
{
    SimpleBMP create()
        throws RemoteException, CreateException;

}
