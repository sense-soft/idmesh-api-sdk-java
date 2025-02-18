/*
 * IDMesh-Dev
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.4.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cn.idmesh.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;

import cn.idmesh.JSON;

/**
 * ResourceWithPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResourceWithPage {
  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Integer totalNum;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ResourceEntity> data;

  public ResourceWithPage() {
  }
   /**
   * 数据总数
   * @return totalNum
  **/
  @javax.annotation.Nullable
  public Integer getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(Integer totalNum) {
    this.totalNum = totalNum;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public List<ResourceEntity> getData() {
    return data;
  }


  public void setData(List<ResourceEntity> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceWithPage resourceWithPage = (ResourceWithPage) o;
    return Objects.equals(this.totalNum, resourceWithPage.totalNum) &&
        Objects.equals(this.data, resourceWithPage.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNum, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceWithPage {\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("total_num");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResourceWithPage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceWithPage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceWithPage is not found in the empty JSON string", ResourceWithPage.openapiRequiredFields.toString()));
        }
      }

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            ResourceEntity.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceWithPage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceWithPage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceWithPage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceWithPage.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceWithPage>() {
           @Override
           public void write(JsonWriter out, ResourceWithPage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceWithPage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResourceWithPage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResourceWithPage
  * @throws IOException if the JSON string is invalid with respect to ResourceWithPage
  */
  public static ResourceWithPage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceWithPage.class);
  }

 /**
  * Convert an instance of ResourceWithPage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

