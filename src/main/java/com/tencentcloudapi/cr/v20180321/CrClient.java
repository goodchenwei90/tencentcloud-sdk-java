/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cr.v20180321;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cr.v20180321.models.*;

public class CrClient extends AbstractClient{
    private static String endpoint = "cr.tencentcloudapi.com";
    private static String version = "2018-03-21";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public CrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public CrClient(Credential credential, String region, ClientProfile profile) {
        super(CrClient.endpoint, CrClient.version, credential, region, profile);
    }

    /**
     *加入黑名单的客户，将停止拨打。用于：
将客户进行黑名单的增加和移除，用于对某些客户阶段性停催。

     * @param req ApplyBlackListRequest
     * @return ApplyBlackListResponse
     * @throws TencentCloudSDKException
     */
    public ApplyBlackListResponse ApplyBlackList(ApplyBlackListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyBlackListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyBlackListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyBlackList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取指定案件的录音地址，次日早上8:00后可查询前日录音。
     * @param req DescribeRecordsRequest
     * @return DescribeRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordsResponse DescribeRecords(DescribeRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据上传文件接口的输出参数DataResId，获取相关上传结果。
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于下载当日催收结果报表，当日23:00后，可获取当日催收结果。
     * @param req DownloadReportRequest
     * @return DownloadReportResponse
     * @throws TencentCloudSDKException
     */
    public DownloadReportResponse DownloadReport(DownloadReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadReportResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadReportResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadReport"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口包含上传：
1、入催文件 — 用于每天入催文件的上传；
2、还款文件 — 实时上传当前已还款客户，用于还款客户的实时停催；
接口返回数据任务ID，支持xlsx、xls、csv、zip格式，文档大小不超过50MB。
     * @param req UploadDataFileRequest
     * @return UploadDataFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadDataFileResponse UploadDataFile(UploadDataFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadDataFileResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UploadDataFileResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UploadDataFile"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *客户通过调用该接口上传需催收文档，格式需为excel格式。接口返回任务ID。
     * @param req UploadFileRequest
     * @return UploadFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadFileResponse UploadFile(UploadFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFileResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFileResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UploadFile"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
