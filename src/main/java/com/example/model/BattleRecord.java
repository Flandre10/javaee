package com.example.model;

import java.util.Date;

public class BattleRecord {
    private Long id;
    private Long userId;
    private Long opponentId;
    private String result;
    private Date timestamp;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Long getOpponentId() { return opponentId; }
    public void setOpponentId(Long opponentId) { this.opponentId = opponentId; }

    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }

    public Date getTimestamp() { return timestamp; }
    public void setTimestamp(Date timestamp) { this.timestamp = timestamp; }
}
