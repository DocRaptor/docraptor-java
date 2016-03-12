package com.docraptor;

import com.sun.jersey.api.client.GenericType;

import com.docraptor.ApiException;
import com.docraptor.ApiClient;
import com.docraptor.Configuration;
import com.docraptor.Pair;

import com.docraptor.AsyncDoc;
import com.docraptor.Doc;
import com.docraptor.AsyncDocStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DocApi {
  private ApiClient apiClient;

  public DocApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   *
   * Creates a document asynchronously. You must use a callback url or the the returned status id and the status api to find out when it completes. Then use the download api to get the document.
   * @param doc The document to be created.
   * @return AsyncDoc
   * @throws ApiException if fails to make API call
   */
  public AsyncDoc createAsyncDoc(Doc doc) throws ApiException {
    Object localVarPostBody = doc;

    // verify the required parameter 'doc' is set
    if (doc == null) {
      throw new ApiException(400, "Missing the required parameter 'doc' when calling createAsyncDoc");
    }

    // create path and map variables
    String localVarPath = "/async_docs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();







    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/pdf", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    GenericType<AsyncDoc> localVarReturnType = new GenericType<AsyncDoc>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);

  }

  /**
   *
   * Creates a document synchronously.
   * @param doc The document to be created.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] createDoc(Doc doc) throws ApiException {
    Object localVarPostBody = doc;

    // verify the required parameter 'doc' is set
    if (doc == null) {
      throw new ApiException(400, "Missing the required parameter 'doc' when calling createDoc");
    }

    // create path and map variables
    String localVarPath = "/docs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();







    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/pdf", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);

  }

  /**
   *
   * Downloads a document.
   * @param id The download_id returned from status request or a callback.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getAsyncDoc(String id) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAsyncDoc");
    }

    // create path and map variables
    String localVarPath = "/download/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();







    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/pdf", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);

  }

  /**
   *
   * Check on the status of an asynchronously created document.
   * @param id The status_id returned when creating an asynchronous document.
   * @return AsyncDocStatus
   * @throws ApiException if fails to make API call
   */
  public AsyncDocStatus getAsyncDocStatus(String id) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAsyncDocStatus");
    }

    // create path and map variables
    String localVarPath = "/status/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();







    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/pdf", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };


    GenericType<AsyncDocStatus> localVarReturnType = new GenericType<AsyncDocStatus>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);

  }

}
