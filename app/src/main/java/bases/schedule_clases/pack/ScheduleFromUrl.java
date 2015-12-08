package bases.schedule_clases.pack;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Pupkin on 08.12.2015.
 */
public class ScheduleFromUrl extends AsyncTask<Void, Void, String> {

    HttpURLConnection urlConnection = null;
    BufferedReader reader = null;
    String resultJson = "";

    @Override
    protected String doInBackground(Void... params) {
        // отримуємо дані із зовнішного ресурсу
        try {
            URL url = new URL("http://uniplanner.somee.com/api/lesson.json");

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();

            reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }

            resultJson = buffer.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultJson;
    }

    @Override
    protected void onPostExecute(String strJson) {
        super.onPostExecute(strJson);
        // виводимо json стрічку
        //Log.d(LOG_TAG, strJson);

        JSONObject dataJsonObj = null;
        String secondName = "";

        try {
            dataJsonObj = new JSONObject(strJson);
            JSONArray lessons = dataJsonObj.getJSONArray("lessons");


            //   перебираємо і виводимо опис уроків
            for (int i = 0; i < lessons.length(); i++) {
                JSONObject friend = lessons.getJSONObject(i);

                JSONObject Sequence = friend.getJSONObject("Sequence");

                String SequenceName = Sequence.getString("SequenceName");
                String StartTime = Sequence.getString("StartTime");
                String EndTime = Sequence.getString("EndTime");

               // Log.d(LOG_TAG, "SequenceName: " + SequenceName);
               // Log.d(LOG_TAG, "StartTime: " + StartTime);
               // Log.d(LOG_TAG, "EndTime: " + EndTime);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
