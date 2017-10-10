/*
 * Copyright (C) 2017 Clivern. <https://clivern.com>
 */
package com.clivern.racter.receivers.webhook;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.json.JSONArray;

/**
 * Postback Webhook
 */
public class PostbackWebhook {

    /*
    {
        "sender":{
            "id":"USER_ID"
        },
        "recipient":{
            "id":"PAGE_ID"
        },
        "timestamp":1458692752478,
        "postback":{
            "payload": USER_DEFINED_PAYLOAD,
            "referral": {
                "ref": USER_DEFINED_REFERRAL_PARAM,
                "source": "SHORTLINK",
                "type": "OPEN_THREAD",
            }
        }
    }
    */

    /**
     * @var String
     */
    protected String user_id;

    /**
     * @var String
     */
    protected String page_id;

    /**
     * @var Long
     */
    protected Long timestamp;

    /**
     * @var Map<String, String>
     */
    protected Map<String, String> postback = new HashMap<String, String>();


    /**
     * Set User ID
     *
     * @param user_id
     * @return void
     */
    public void setUserId(String user_id)
    {
        this.user_id = user_id;
    }

    /**
     * Set Page ID or Receiver ID
     *
     * @param page_id
     * @return void
     */
    public void setPageId(String page_id)
    {
        this.page_id = page_id;
    }

    /**
     * Set Timestamp
     *
     * @param timestamp
     * @return void
     */
    public void setTimestamp(Long timestamp)
    {
        this.timestamp = timestamp;
    }

    /**
     * Set Postback
     *
     * @param key
     * @param value
     * @return void
     */
    public void setPostback(String key, String value)
    {
        postback.put(key, value);
    }

    /**
     * Check if User ID Exist
     *
     * @return Boolean
     */
    public Boolean hasUserId()
    {
        return (this.user_id != null);
    }

    /**
     * Check if Page ID Exist
     *
     * @return Boolean
     */
    public Boolean hasPageId()
    {
        return (this.page_id != null);
    }

    /**
     * Check if Timestamp Exist
     *
     * @return Boolean
     */
    public Boolean hasTimestamp()
    {
        return (this.timestamp != null);
    }

    /**
     * Check if Postback Exist
     *
     * @return Boolean
     */
    public Boolean hasPostback()
    {
        return !this.postback.isEmpty();
    }

    /**
     * Get User ID
     *
     * @return String
     */
    public String getUserId()
    {
        return this.user_id;
    }

    /**
     * Get Page ID
     *
     * @return String
     */
    public String getPageId()
    {
        return this.page_id;
    }

    /**
     * Get Timestamp
     *
     * @return Long
     */
    public Long getTimestamp()
    {
        return this.timestamp;
    }

    /**
     * Get Postback
     *
     * @return Map<String, String>
     */
    public Map<String, String> getPostback()
    {
        return this.postback;
    }
}