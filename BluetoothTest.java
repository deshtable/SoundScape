import android.bluetooth

public class BluetoothTest{
  public static void main(String[] args){
    BluetoothAdapater BluetoothAdapater = BluetoothAdapter.detDefaultAdapter();
    if (!bluetoothAdapter.isEnabled()) {
      Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
      startActivityForResult(enableBtIntent, request_code_for_enabling_bt);
    }
    Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
    BluetoothSocket socket = device.createRfcommSocketToServiceRecord(YOUR_UUID);
    socket.connect();


}
  }
}

}
