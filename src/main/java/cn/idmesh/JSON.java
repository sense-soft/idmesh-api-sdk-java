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


package cn.idmesh;

import cn.idmesh.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new AddNodeMembersReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new App.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AppConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AppConfigAllowedIdProvider.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AppConfigRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AppConfigRetMfaConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AppSubAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AppSubAccountWithPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AppWithPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AppWithPageDataInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Au.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AuResourceSet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AuthConfigEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AuthConfigRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AuthMethodRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AuthMethodRetConfigFieldsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AuthUnit.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AuthUnitResouce.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AuthUnitResourceSet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AuthUnitRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AuthUnitWithPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BadRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchCreateAuthUnitRuleReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchCreateAuthUnitRuleReqIdentitiesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchDeleteAuthUnitRuleReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchDeleteOrgNodeReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchDeleteResourceReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchDeleteUserReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchDeleteUserRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchDisableUserReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchDisableUserRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchEnableUserReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchEnableUserRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchResetPasswordReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new BatchResetPasswordRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Bucket.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CheckUserExistsReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CommonRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAccount200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAccountRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAppIDPReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAppReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAppReqConfigProp.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAppReqConfigPropAccessPolicy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAppReqConfigPropAllowedLoginMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAppReqConfigPropAllowedSocialLoginProvider.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAppReqProtocolProp.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAppReqProtocolPropResponseAttrInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAppReqTemplateParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAuthConfigReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAuthConfigReqConfigFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateAuthConfigRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateIDPConnectionReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateIDPConnectionReqConfigFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateIDPConnectionRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateNodeRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateOrganizationReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateResourceReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateResourceSetMemberReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateResourceSetMemberRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateResourceSetReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateResourceSetRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateResoureRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateUserReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new CreateUserStoredCredentialReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new DeleteAppRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new DeleteAuthConfigRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new DeleteAuthConfigRetConfigFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new DeleteIDPConnectionRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new DeleteIDPConnectionRetConfigFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new DeleteNodeMemberReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Disable200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EmptyObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EnableAppProtocolRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new EnableAppRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetAccounts200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GetMembers200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new IDPConnectionRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new IDPTestReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new IdentityObj.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new KeyValuePair.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MFA.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModelObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAccountRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAppConfigReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAppConfigRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAppProtocol.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAppReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAppReqProtocols.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAppReqProtocolsOidc.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAppReqTemplateParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAppRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAuthConfigReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAuthConfigReqConfigFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAuthConfigRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAuthRuleReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyAuthUnitRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyIDPConnectionReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyIDPConnectionReqConfigFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyIDPConnectionRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyNodeMemberReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyOrganizationNodeReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyOrganizationReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyPasswordReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyResourceReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyResourceReqActionsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyResourceSetMemberReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyResourceSetMemberReqResourceActionsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyResourceSetReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ModifyUserReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new NodeMemberWithPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new NodeMemberWithPageDataInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new NodeMemberWithPageDataInnerNodeInfoInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new NodeUserPair.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new OrganizationTree.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new RefreshAppSecretRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new RefreshAppSecretRetData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResetAppProtocolSecretRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResetPasswordReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Resource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResourceEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResourceEntity1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResourceSet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResourceSetEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResourceSetMember.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResourceSetMemberResourceActions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResourceSetMemberWithPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResourceSetWithPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ResourceWithPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TreeNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TreeUser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new UserDetailRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new UserRet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new UserStoredCredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new UserStoredCredentialWithPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new UserWithPage.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
