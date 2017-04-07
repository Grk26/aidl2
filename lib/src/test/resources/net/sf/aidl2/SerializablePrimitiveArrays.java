package net.sf.aidl2;

import android.os.IInterface;
import android.os.RemoteException;

@AIDL("net.sf.aidl2.SerializablePrimitiveArrays")
public interface SerializablePrimitiveArrays extends IInterface {
    short[] floatArrayParamsAndReturn(short[] miscSerializable) throws RemoteException;
}
