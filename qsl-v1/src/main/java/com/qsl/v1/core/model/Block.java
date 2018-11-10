package com.qsl.v1.core.model;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "comment",
        "id",
        "version",
        "text",
        "timestamp",
        "block"
})
public class Block {

    @JsonProperty("comment")
    private List<String> comment = new LinkedList<String>();
    @JsonProperty("id")
    private List<String> id = new LinkedList<String>();
    @JsonProperty("version")
    private List<String> version = new LinkedList<String>();
    @JsonProperty("text")
    private List<String> text = new LinkedList<String>();
    @JsonProperty("timestamp")
    private List<String> timestamp = new LinkedList<String>();
    @JsonProperty("block")
    private List<Block> block = new LinkedList<Block>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("comment")
    public List<String> getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(List<String> comment) {
        this.comment = comment;
    }

    public Block withComment(List<String> comment) {
        this.comment = comment;
        return this;
    }

    @JsonProperty("id")
    public List<String> getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(List<String> id) {
        this.id = id;
    }

    public Block withId(List<String> id) {
        this.id = id;
        return this;
    }

    @JsonProperty("version")
    public List<String> getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(List<String> version) {
        this.version = version;
    }

    public Block withVersion(List<String> version) {
        this.version = version;
        return this;
    }

    @JsonProperty("timestamp")
    public List<String> getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(List<String> timestamp) {
        this.timestamp = timestamp;
    }

    public Block withTimestamp(List<String> timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("text")
    public List<String> getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(List<String> text) {
        this.text = text;
    }

    public Block withText(List<String> text) {
        this.text = text;
        return this;
    }

    @JsonProperty("block")
    public List<Block> getBlock() {
        return block;
    }

    @JsonProperty("block")
    public void setBlock(List<Block> block) {
        this.block = block;
    }

    public Block withBlock(List<Block> block) {
        this.block = block;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Block withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.JSON_STYLE);
        addIfNotNull(builder,"comment", comment);
        addIfNotNull(builder,"id", id);
        addIfNotNull(builder,"version", version);
        addIfNotNull(builder,"text", text);
        addIfNotNull(builder,"timestamp", timestamp);
        addIfNotNull(builder,"block", block);
        return builder.toString();
    }

    private void addIfNotNull(
            ToStringBuilder builder,
            String name,
            List<?> property){
        if (property != null && !property.isEmpty()){
            builder.append(name,property);
        }
    }
}

