package com.ObtSoft.passit.app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Created by Abdulgafar Obeitor on 11/14/2016.
 */

public class ActivateBackground extends AsyncTask <String, String, String>{
    private Activity context;
   private ProgressDialog loading;
    public static void createBackgroundActivity(Activity context, String param){
       ActivateBackground bg = new ActivateBackground(context);
        bg.execute(param);
    }
    protected ActivateBackground(Activity context){
        this.context = context;
        this.loading = new ProgressDialog(context);
        loading.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        loading.setMessage("Registering Product");
        loading.setIndeterminate(true);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        this.loading.show();
    }

    @Override
    protected String doInBackground(String... arg0){
        String s = "";
        try{
            String auth_key =  arg0[0];
            String link = "http://www.efiwe.net/passit/activate.php";
            String data = URLEncoder.encode("code", "UTF-8") + "=" +URLEncoder.encode(auth_key,"UTF-8");
            URL url = new URL(link);
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(12000);
            conn.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
            writer.write(data);writer.flush();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();String line;
            while((line = reader.readLine())!=null){
                sb.append(line);break;
            }s=sb.toString();
        }
        catch(MalformedURLException e){
            this.cancel(true);
        }
        catch(IOException e){
            this.cancel(true);
        }

        return s;
    }
    @Override
    protected void onCancelled(){
        Toast.makeText(this.context,"UNSUCCESSFUL",Toast.LENGTH_LONG).show();
        this.loading.dismiss();
    }
    @Override
    protected void onPostExecute(String result){
        this.loading.dismiss();
        if(result.equalsIgnoreCase("SUCCESS")){
            MainActivity.setActivationStatus("ORE SUTA");
            Toast.makeText(this.context,"SUCCESSFULLY REGISTERED", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this.context,"UNSUCCESSFUL",Toast.LENGTH_LONG).show();
            MainActivity.setActivationStatus("EYYI SUTA");
        }
        this.context.finish();
    }
}
