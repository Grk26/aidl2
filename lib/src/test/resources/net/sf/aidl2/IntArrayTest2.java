package net.sf.aidl2;

import android.os.IInterface;
import android.os.RemoteException;

@AIDL("net.sf.aidl2.IntArrayTest2")
public interface IntArrayTest2 extends IInterface {
    int[] methodWithIntArrayReturn() throws RemoteException;
}
