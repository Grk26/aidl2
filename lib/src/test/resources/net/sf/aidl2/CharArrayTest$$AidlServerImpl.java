// AUTO-GENERATED FILE.  DO NOT MODIFY.
package net.sf.aidl2;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;

/**
 * Handle incoming IPC calls by forwarding them to provided delegate.
 *
 * You can create instances of this class, using {@link InterfaceLoader}.
 *
 * @deprecated — do not use this class directly in your Java code (see above)
 */
@Deprecated
public final class CharArrayTest$$AidlServerImpl extends Binder {
    static final String DESCRIPTOR = "net.sf.aidl2.CharArrayTest";

    static final int TRANSACT_methodWithBiCharArrayReturn = IBinder.FIRST_CALL_TRANSACTION;

    private final CharArrayTest delegate;

    public CharArrayTest$$AidlServerImpl(CharArrayTest delegate) {
        this.delegate = delegate;

        this.attachInterface(delegate, DESCRIPTOR);
    }

    @Override
    protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
        switch(code) {
            case TRANSACT_methodWithBiCharArrayReturn: {
                data.enforceInterface(this.getInterfaceDescriptor());

                final char[][] returnValue = delegate.methodWithBiCharArrayReturn();
                reply.writeNoException();

                if (returnValue == null) {
                    reply.writeInt(-1);
                } else {
                    reply.writeInt(returnValue.length);
                    for (char[] returnValueComponent : returnValue) {
                        reply.writeCharArray(returnValueComponent);
                    }
                }

                return true;
            }
        }
        return super.onTransact(code, data, reply, flags);
    }
}
