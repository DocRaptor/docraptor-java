/*
 * DocRaptor v1
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.2.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.docraptor;

import com.docraptor.ApiException;
import com.docraptor.AsyncDoc;
import com.docraptor.AsyncDocStatus;
import com.docraptor.Doc;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocApi
 */
@Ignore
public class DocApiTest {

    private final DocApi api = new DocApi();


    /**
     *
     *
     * Creates a document asynchronously. You must use a callback url or the the returned status id and the status api to find out when it completes. Then use the download api to get the document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAsyncDocTest() throws ApiException {
        Doc doc = null;
        AsyncDoc response = api.createAsyncDoc(doc);

        // TODO: test validations
    }

    /**
     *
     *
     * Creates a document synchronously.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDocTest() throws ApiException {
        Doc doc = null;
        byte[] response = api.createDoc(doc);

        // TODO: test validations
    }

    /**
     *
     *
     * Downloads a document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAsyncDocTest() throws ApiException {
        Object id = null;
        byte[] response = api.getAsyncDoc(id);

        // TODO: test validations
    }

    /**
     *
     *
     * Check on the status of an asynchronously created document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAsyncDocStatusTest() throws ApiException {
        Object id = null;
        AsyncDocStatus response = api.getAsyncDocStatus(id);

        // TODO: test validations
    }

}
