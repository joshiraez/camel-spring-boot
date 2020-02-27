/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.aws2.kinesis.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.aws2.kinesis.Kinesis2ShardClosedStrategyEnum;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import software.amazon.awssdk.core.Protocol;
import software.amazon.awssdk.services.kinesis.KinesisClient;
import software.amazon.awssdk.services.kinesis.model.ShardIteratorType;

/**
 * The aws2-kinesis component is for consuming and producing records from Amazon
 * Kinesis Streams.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws2-kinesis")
public class Kinesis2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws2-kinesis component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Region
     */
    private String region;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * The AWS S3 default configuration
     */
    private Kinesis2ConfigurationNestedConfiguration configuration;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Kinesis2ConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            Kinesis2ConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public static class Kinesis2ConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws2.kinesis.Kinesis2Configuration.class;
        /**
         * Amazon AWS Access Key
         */
        private String accessKey;
        /**
         * Amazon Kinesis client to use for all requests for this endpoint
         */
        private KinesisClient amazonKinesisClient;
        /**
         * Defines where in the Kinesis stream to start getting records
         */
        private ShardIteratorType iteratorType = ShardIteratorType.TRIM_HORIZON;
        /**
         * Maximum number of records that will be fetched in each poll
         */
        private Integer maxResultsPerRequest = 1;
        /**
         * To define a proxy host when instantiating the Kinesis client
         */
        private String proxyHost;
        /**
         * To define a proxy port when instantiating the Kinesis client
         */
        private Integer proxyPort;
        /**
         * To define a proxy protocol when instantiating the Kinesis client
         */
        private Protocol proxyProtocol = Protocol.HTTPS;
        /**
         * The region in which Kinesis Firehose client needs to work. When using
         * this parameter, the configuration will expect the lowercase name of
         * the region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id()
         */
        private String region;
        /**
         * Amazon AWS Secret Key
         */
        private String secretKey;
        /**
         * The sequence number to start polling from. Required if iteratorType
         * is set to AFTER_SEQUENCE_NUMBER or AT_SEQUENCE_NUMBER
         */
        private String sequenceNumber;
        /**
         * Define what will be the behavior in case of shard closed. Possible
         * value are ignore, silent and fail. In case of ignore a message will
         * be logged and the consumer will restart from the beginning,in case of
         * silent there will be no logging and the consumer will start from the
         * beginning,in case of fail a ReachedClosedStateException will be
         * raised
         */
        private Kinesis2ShardClosedStrategyEnum shardClosed = Kinesis2ShardClosedStrategyEnum.ignore;
        /**
         * Defines which shardId in the Kinesis stream to get records from
         */
        private String shardId;
        /**
         * Name of the stream
         */
        private String streamName;

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public KinesisClient getAmazonKinesisClient() {
            return amazonKinesisClient;
        }

        public void setAmazonKinesisClient(KinesisClient amazonKinesisClient) {
            this.amazonKinesisClient = amazonKinesisClient;
        }

        public ShardIteratorType getIteratorType() {
            return iteratorType;
        }

        public void setIteratorType(ShardIteratorType iteratorType) {
            this.iteratorType = iteratorType;
        }

        public Integer getMaxResultsPerRequest() {
            return maxResultsPerRequest;
        }

        public void setMaxResultsPerRequest(Integer maxResultsPerRequest) {
            this.maxResultsPerRequest = maxResultsPerRequest;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public Protocol getProxyProtocol() {
            return proxyProtocol;
        }

        public void setProxyProtocol(Protocol proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getSequenceNumber() {
            return sequenceNumber;
        }

        public void setSequenceNumber(String sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
        }

        public Kinesis2ShardClosedStrategyEnum getShardClosed() {
            return shardClosed;
        }

        public void setShardClosed(Kinesis2ShardClosedStrategyEnum shardClosed) {
            this.shardClosed = shardClosed;
        }

        public String getShardId() {
            return shardId;
        }

        public void setShardId(String shardId) {
            this.shardId = shardId;
        }

        public String getStreamName() {
            return streamName;
        }

        public void setStreamName(String streamName) {
            this.streamName = streamName;
        }
    }
}