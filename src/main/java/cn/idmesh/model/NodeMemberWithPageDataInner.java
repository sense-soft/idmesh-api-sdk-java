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
import java.util.ArrayList;
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
 * NodeMemberWithPageDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NodeMemberWithPageDataInner {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_NODE_INFO = "node_info";
  @SerializedName(SERIALIZED_NAME_NODE_INFO)
  private List<NodeMemberWithPageDataInnerNodeInfoInner> nodeInfo = new ArrayList<>();

  public NodeMemberWithPageDataInner() {
  }
   /**
   * 用户ID
   * @return userId
  **/
  @javax.annotation.Nonnull
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }

   /**
   * 用户名
   * @return username
  **/
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }

   /**
   * 用户显示名
   * @return displayName
  **/
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

   /**
   * 用户节点信息
   * @return nodeInfo
  **/
  @javax.annotation.Nonnull
  public List<NodeMemberWithPageDataInnerNodeInfoInner> getNodeInfo() {
    return nodeInfo;
  }


  public void setNodeInfo(List<NodeMemberWithPageDataInnerNodeInfoInner> nodeInfo) {
    this.nodeInfo = nodeInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeMemberWithPageDataInner nodeMemberWithPageDataInner = (NodeMemberWithPageDataInner) o;
    return Objects.equals(this.userId, nodeMemberWithPageDataInner.userId) &&
        Objects.equals(this.username, nodeMemberWithPageDataInner.username) &&
        Objects.equals(this.displayName, nodeMemberWithPageDataInner.displayName) &&
        Objects.equals(this.nodeInfo, nodeMemberWithPageDataInner.nodeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, username, displayName, nodeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeMemberWithPageDataInner {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
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
    openapiFields.add("user_id");
    openapiFields.add("username");
    openapiFields.add("display_name");
    openapiFields.add("node_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_id");
    openapiRequiredFields.add("username");
    openapiRequiredFields.add("display_name");
    openapiRequiredFields.add("node_info");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NodeMemberWithPageDataInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NodeMemberWithPageDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NodeMemberWithPageDataInner is not found in the empty JSON string", NodeMemberWithPageDataInner.openapiRequiredFields.toString()));
        }
      }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NodeMemberWithPageDataInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if (!jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("node_info").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_info` to be an array in the JSON string but got `%s`", jsonObj.get("node_info").toString()));
      }

      JsonArray jsonArraynodeInfo = jsonObj.getAsJsonArray("node_info");
      // validate the required field `node_info` (array)
      for (int i = 0; i < jsonArraynodeInfo.size(); i++) {
        NodeMemberWithPageDataInnerNodeInfoInner.validateJsonElement(jsonArraynodeInfo.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NodeMemberWithPageDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NodeMemberWithPageDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NodeMemberWithPageDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NodeMemberWithPageDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NodeMemberWithPageDataInner>() {
           @Override
           public void write(JsonWriter out, NodeMemberWithPageDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NodeMemberWithPageDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NodeMemberWithPageDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NodeMemberWithPageDataInner
  * @throws IOException if the JSON string is invalid with respect to NodeMemberWithPageDataInner
  */
  public static NodeMemberWithPageDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NodeMemberWithPageDataInner.class);
  }

 /**
  * Convert an instance of NodeMemberWithPageDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

