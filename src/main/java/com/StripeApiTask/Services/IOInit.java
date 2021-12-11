package com.StripeApiTask.Services;

import com.StripeApiTask.Model.InvoiceModel;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;

@Log4j
public class IOInit {
    public InvoiceModel initInputReaderGetResponse(HttpURLConnection connection){
        InvoiceModel response = InvoiceModel.builder().build();
        try(InputStreamReader reader = new InputStreamReader(connection.getInputStream())) {
            response = new Gson().fromJson(reader, InvoiceModel.class);
        }catch(Exception e){
            log.error("Error in initInputReaderGetResponse while trying to connect",e);
        } finally {
            connection.disconnect();
        }
        return response;
    }

    public String initOutputWriterGetResponse(HttpURLConnection connection, String customer) throws IOException {
        String response = "";
        try (OutputStream o = connection.getOutputStream()) {
            o.write(customer.getBytes(StandardCharsets.UTF_8), 0, customer.length());
        } catch (Exception e) {
            log.error("Error in initOutputWriterGetResponse while trying to connect",e);
        } finally {
            InputStreamReader in = new InputStreamReader(connection.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String text = "";
            while ((text = br.readLine()) != null) {
                response+= text;
            }
            connection.disconnect();
        }
        return response;
    }
}
