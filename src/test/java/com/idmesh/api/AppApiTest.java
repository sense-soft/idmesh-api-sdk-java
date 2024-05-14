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


package com.idmesh.api;

import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.model.App;
import com.idmesh.model.AppConfigRet;
import com.idmesh.model.AppSubAccount;
import com.idmesh.model.AppSubAccountWithPage;
import com.idmesh.model.AppWithPage;
import com.idmesh.model.BadRequest;
import com.idmesh.model.CommonRet;
import com.idmesh.model.CreateAccount200Response;
import com.idmesh.model.CreateAccountRequest;
import com.idmesh.model.CreateAppIDPReq;
import com.idmesh.model.CreateAppReq;
import com.idmesh.model.DeleteAppRet;
import com.idmesh.model.Disable200Response;
import com.idmesh.model.EmptyObject;
import com.idmesh.model.EnableAppProtocolRet;
import com.idmesh.model.EnableAppRet;
import com.idmesh.model.GetAccounts200Response;
import com.idmesh.model.ModifyAccountRequest;
import com.idmesh.model.ModifyAppConfigReq;
import com.idmesh.model.ModifyAppConfigRet;
import com.idmesh.model.ModifyAppProtocol;
import com.idmesh.model.ModifyAppReq;
import com.idmesh.model.ModifyAppRet;
import com.idmesh.model.RefreshAppSecretRet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppApi
 */
@Disabled
public class AppApiTest {

    private final ApiClient apiClient = new ApiClient("http://service-gate.api.dev.idmesh.site", "u4X5vTGPH4NCdNTylSYn1JHe", "BkCCUZLVVR9wSi2aiYTOYUZDKps7xgQT");
    private final AppApi api = new AppApi(apiClient);

    /**
     * 查询应用列表
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void callListTest() throws ApiException {
        String name = null;
        String type = null;
        String pageSort = null;
        String types = null;
        AppWithPage response = api.callList()
                .name(name)
                .type(type)
                .pageSort(pageSort)
                .types(types)
                .execute();
        // TODO: test validations
    }

    /**
     * 创建应用
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        String contentType = null;
        CreateAppReq createAppReq = null;
        CommonRet response = api.create(contentType)
                .createAppReq(createAppReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 创建应用子账号
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAccountTest() throws ApiException {
        String id = null;
        String contentType = null;
        CreateAccountRequest createAccountRequest = null;
        CreateAccount200Response response = api.createAccount(id, contentType)
                .createAccountRequest(createAccountRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * 创建应用认证源
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createIDPTest() throws ApiException {
        String id = null;
        String contentType = null;
        CreateAppIDPReq createAppIDPReq = null;
        Object response = api.createIDP(id, contentType)
                .createAppIDPReq(createAppIDPReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 启用应用多因素认证配置
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMFATest() throws ApiException {
        String id = null;
        String contentType = null;
        EmptyObject emptyObject = null;
        Object response = api.createMFA(id, contentType)
                .emptyObject(emptyObject)
                .execute();
        // TODO: test validations
    }

    /**
     * 刷新应用安全码
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSecretsTest() throws ApiException {
        String id = null;
        String contentType = null;
        RefreshAppSecretRet response = api.createSecrets(id, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 删除应用
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String id = null;
        String contentType = null;
        DeleteAppRet response = api.delete(id, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 删除应用子账号
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAccountTest() throws ApiException {
        String appId = null;
        String id = null;
        String contentType = null;
        Object response = api.deleteAccount(appId, id, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 删除应用认证源
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteIDPConfigTest() throws ApiException {
        String appId = null;
        String configId = null;
        String contentType = null;
        Object response = api.deleteIDPConfig(appId, configId, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 禁用应用多因素认证配置
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMFATest() throws ApiException {
        String appId = null;
        String configId = null;
        String contentType = null;
        Object response = api.deleteMFA(appId, configId, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 禁用应用
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableTest() throws ApiException {
        String id = null;
        String contentType = null;
        Disable200Response response = api.disable(id, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 禁用应用子账号
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableAccountTest() throws ApiException {
        String appId = null;
        String id = null;
        String contentType = null;
        Object response = api.disableAccount(appId, id, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 禁用应用认证协议
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableProtocolTest() throws ApiException {
        String appId = null;
        String protocolType = null;
        String contentType = null;
        Object response = api.disableProtocol(appId, protocolType, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 禁用应用单点登录
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableSSOTest() throws ApiException {
        String id = null;
        Object response = api.disableSSO(id)
                .execute();
        // TODO: test validations
    }

    /**
     * 启用应用
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableTest() throws ApiException {
        String id = null;
        String contentType = null;
        EnableAppRet response = api.enable(id, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 启用应用子账号
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableAccountTest() throws ApiException {
        String appId = null;
        String id = null;
        String id2 = null;
        String contentType = null;
        Object response = api.enableAccount(appId, id, id2, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 启用应用认证协议
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableProtocolTest() throws ApiException {
        String appId = null;
        String protocolType = null;
        String contentType = null;
        EnableAppProtocolRet response = api.enableProtocol(appId, protocolType, contentType)
                .execute();
        // TODO: test validations
    }

    /**
     * 启用应用单点登录
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableSSOTest() throws ApiException {
        String id = null;
        Object response = api.enableSSO(id)
                .execute();
        // TODO: test validations
    }

    /**
     * 按 ID 查询应用
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String id = null;
        App response = api.get(id)
                .execute();
        // TODO: test validations
    }

    /**
     * 按 ID 查询应用子账号
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountTest() throws ApiException {
        String appId = null;
        String id = null;
        AppSubAccount response = api.getAccount(appId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * 按条件查询应用子账号列表
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountsTest() throws ApiException {
        String appId = null;
        String userId = null;
        String accStatus = null;
        String accName = null;
        Integer pageNum = null;
        Integer pageSize = null;
        String pageSort = null;
        String accNameEq = null;
        String timeModifiedGt = null;
        String timeModifiedLt = null;
        String accType = null;
        String orphanedOnly = null;
        String linkedUserId = null;
        String hideSelf = null;
        GetAccounts200Response response = api.getAccounts()
                .appId(appId)
                .userId(userId)
                .accStatus(accStatus)
                .accName(accName)
                .pageNum(pageNum)
                .pageSize(pageSize)
                .pageSort(pageSort)
                .accNameEq(accNameEq)
                .timeModifiedGt(timeModifiedGt)
                .timeModifiedLt(timeModifiedLt)
                .accType(accType)
                .orphanedOnly(orphanedOnly)
                .linkedUserId(linkedUserId)
                .hideSelf(hideSelf)
                .execute();
        // TODO: test validations
    }

    /**
     * 按 APP ID 查询应用子账号列表
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountsByAppTest() throws ApiException {
        String appId = null;
        String userId = null;
        String accStatus = null;
        String accName = null;
        Integer pageNum = null;
        Integer pageSize = null;
        String pageSort = null;
        AppSubAccountWithPage response = api.getAccountsByApp(appId)
                .userId(userId)
                .accStatus(accStatus)
                .accName(accName)
                .pageNum(pageNum)
                .pageSize(pageSize)
                .pageSort(pageSort)
                .execute();
        // TODO: test validations
    }

    /**
     * 按条件查询应用
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByDomainTest() throws ApiException {
        String domain = null;
        String domainSn = null;
        App response = api.getByDomain()
                .domain(domain)
                .domainSn(domainSn)
                .execute();
        // TODO: test validations
    }

    /**
     * 查询应用配置信息
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        String id = null;
        AppConfigRet response = api.getConfig(id)
                .execute();
        // TODO: test validations
    }

    /**
     * 查询应用认证协议
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProtocolTest() throws ApiException {
        String appId = null;
        String protocolType = null;
        Object response = api.getProtocol(appId, protocolType)
                .execute();
        // TODO: test validations
    }

    /**
     * 查询应用认证协议列表
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProtocolsTest() throws ApiException {
        String id = null;
        String status = null;
        List<Object> response = api.getProtocols(id)
                .status(status)
                .execute();
        // TODO: test validations
    }

    /**
     * 更新应用基本信息
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyTest() throws ApiException {
        String id = null;
        String contentType = null;
        ModifyAppReq modifyAppReq = null;
        ModifyAppRet response = api.modify(id, contentType)
                .modifyAppReq(modifyAppReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 更新应用子账号
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyAccountTest() throws ApiException {
        String appId = null;
        String id = null;
        String contentType = null;
        ModifyAccountRequest modifyAccountRequest = null;
        CreateAccount200Response response = api.modifyAccount(appId, id, contentType)
                .modifyAccountRequest(modifyAccountRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * 更新应用配置
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyConfigTest() throws ApiException {
        String id = null;
        String contentType = null;
        ModifyAppConfigReq modifyAppConfigReq = null;
        ModifyAppConfigRet response = api.modifyConfig(id, contentType)
                .modifyAppConfigReq(modifyAppConfigReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 更新应用认证协议
     *
     *  具体入参参考：[https://thoughts.teambition.com/workspaces/607401bc94422600473bb8a7/docs/62207129fb49bf000106a046](https://thoughts.teambition.com/workspaces/607401bc94422600473bb8a7/docs/62207129fb49bf000106a046) 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyProtocolTest() throws ApiException {
        String appId = null;
        String protocolType = null;
        String contentType = null;
        ModifyAppProtocol modifyAppProtocol = null;
        Object response = api.modifyProtocol(appId, protocolType, contentType)
                .modifyAppProtocol(modifyAppProtocol)
                .execute();
        // TODO: test validations
    }

}
