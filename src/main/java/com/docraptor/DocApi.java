package com.docraptor;

import com.sun.jersey.api.client.GenericType;

import com.docraptor.ApiException;
import com.docraptor.ApiClient;
import com.docraptor.Configuration;
import com.docraptor.Pair;

import com.docraptor.AsyncDoc;
import com.docraptor.Doc;
import com.docraptor.AsyncDocStatus;

import java.util.*;


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
   */
  public AsyncDoc createAsyncDoc(Doc doc) throws ApiException {
    Object postBody = doc;
    
     // verify the required parameter 'doc' is set
     if (doc == null) {
        throw new ApiException(400, "Missing the required parameter 'doc' when calling createAsyncDoc");
     }
     
    // create path and map variables
    String path = "/async_docs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "application/pdf", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "basicAuth" };

    
    GenericType<AsyncDoc> returnType = new GenericType<AsyncDoc>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * 
   * Creates a document synchronously.
   * @param doc The document to be created.
   * @return byte[]
   */
  public byte[] createDoc(Doc doc) throws ApiException {
    Object postBody = doc;
    
     // verify the required parameter 'doc' is set
     if (doc == null) {
        throw new ApiException(400, "Missing the required parameter 'doc' when calling createDoc");
     }
     
    // create path and map variables
    String path = "/docs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "application/pdf", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "basicAuth" };

    
    GenericType<byte[]> returnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * 
   * Downloads a document.
   * @param id The download_id returned from status request or a callback.
   * @return byte[]
   */
  public byte[] getAsyncDoc(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getAsyncDoc");
     }
     
    // create path and map variables
    String path = "/download/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "application/pdf", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "basicAuth" };

    
    GenericType<byte[]> returnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * 
   * Check on the status of an asynchronously created document.
   * @param id The status_id returned when creating an asynchronous document.
   * @return AsyncDocStatus
   */
  public AsyncDocStatus getAsyncDocStatus(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getAsyncDocStatus");
     }
     
    // create path and map variables
    String path = "/status/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "application/pdf", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "basicAuth" };

    
    GenericType<AsyncDocStatus> returnType = new GenericType<AsyncDocStatus>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
