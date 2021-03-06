package dbmon.model.maria103;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class Maria103GlobalVariable {

    @Id @GeneratedValue
    private Long id;
    private String innodbForceRecovery;
    private final LocalDateTime logtime = LocalDateTime.now();
    private String performanceSchema;

    private String sqlMode;
    private String performanceSchemaEventsWaitsHistoryLongSize;
    private String binlogRowImage;
    private String performanceSchemaMaxCondClasses;
    private String performanceSchemaMaxCondInstances;
    private String innodbFtCacheSize;
    private String performanceSchemaMaxRwlockClasses;
    private String innodbFlushLogAtTimeout;
    private String logBinCompress;
    private String innodbEncryptTemporaryTables;
    private String maxConnectErrors;
    private String queryCacheStripComments;
    private String performanceSchemaMaxMutexInstances;
    private String performanceSchemaMaxRwlockInstances;
    private String debugNoThreadAlarm;
    private String performanceSchemaMaxMutexClasses;
    private String innodbStatsTransientSamplePages;
    private String netWriteTimeout;
    private String slowLaunchTime;
    private String performanceSchemaAccountsSize;
    private String slaveExecMode;
    private String characterSetServer;
    private String innodbAdaptiveHashIndexParts;
    private String preloadBufferSize;
    private String threadPoolOversubscribe;
    private String performanceSchemaEventsWaitsHistorySize;
    private String haveProfiling;
    private String performanceSchemaEventsStagesHistorySize;
    private String innodbFtNumWordOptimize;
    private String waitTimeout;
    private String basedir;
    private String performanceSchemaMaxThreadInstances;
    private String tmpMemoryTableSize;
    private String delayedQueueSize;
    private String reportHost;
    private String rplSemiSyncSlaveKillConnTimeout;
    private String innodbSortBufferSize;
    private String performanceSchemaSetupObjectsSize;
    private String innodbRollbackSegments;
    private String binlogFileCacheSize;
    private String largeFilesSupport;
    private String reportPort;
    private String queryAllocBlockSize;
    private String bindAddress;
    private String netBufferLength;
    private String logBin;
    private String innodbBackgroundScrubDataCompressed;
    private String characterSetConnection;
    private String groupConcatMaxLen;
    private String maxStatementTime;
    private String rangeAllocBlockSize;
    private String binlogStmtCacheSize;
    private String versionMallocLibrary;
    private String characterSetResults;
    private String innodbTmpdir;
    private String threadHandling;
    private String innodbEncryptionThreads;
    private String expireLogsDays;
    private String myisamRecoverOptions;
    private String columnCompressionZlibWrap;
    private String threadPoolMinThreads;
    private String delayedInsertLimit;
    private String lowPriorityUpdates;
    private String explicitDefaultsForTimestamp;
    private String reportPassword;
    private String completionType;
    private String maxInsertDelayedThreads;
    private String performanceSchemaEventsStagesHistoryLongSize;
    private String sqlBigSelects;
    private String myisamMmapSize;
    private String transactionAllocBlockSize;
    private String tmpTableSize;
    private String innodbFlushingAvgLoops;
    private String joinCacheLevel;
    private String syncFrm;
    private String maxDigestLength;
    private String relayLogPurge;
    private String performanceSchemaMaxStageClasses;
    private String innodbScrubLog;
    private String slaveMaxAllowedPacket;
    private String innodbIoCapacityMax;
    private String syncRelayLogInfo;
    private String innodbIoCapacity;
    private String keyCacheBlockSize;
    private String maxPasswordErrors;
    private String gtidSlavePos;
    private String backLog;
    private String automaticSpPrivileges;
    private String logSlowSlaveStatements;
    private String concurrentInsert;
    private String innodbCompressionDefault;
    private String innodbReplicationDelay;
    private String innodbAutoextendIncrement;
    private String delayKeyWrite;
    private String myisamDataPointerSize;
    private String ftQueryExpansionLimit;
    private String innodbThreadSleepDelay;
    private String performanceSchemaSetupActorsSize;
    private String sqlAutoIsNull;
    private String autoIncrementOffset;
    private String ariaUsedForTempTables;
    private String logQueriesNotUsingIndexes;
    private String gtidCleanupBatchSize;
    private String joinBufferSize;
    private String generalLog;
    private String connectTimeout;
    private String innodbStatusOutputLocks;
    private String lcMessagesDir;
    private String queryCacheMinResUnit;
    private String sortBufferSize;
    private String largePages;
    private String innodbRollbackOnTimeout;
    private String logBinBasename;
    private String standardCompliantCte;
    private String performanceSchemaMaxFileClasses;
    private String ariaRepairThreads;
    private String initSlave;
    private String joinBufferSpaceLimit;
    private String columnCompressionZlibLevel;
    private String innodbFileFormat;
    private String maxBinlogSize;
    private String ariaLogFileSize;
    private String relayLogBasename;
    private String replicateWildDoTable;
    private String eventScheduler;
    private String tcpKeepaliveTime;
    private String ignoreBuiltinInnodb;
    private String readOnly;
    private String logBinCompressMinLen;
    private String lockWaitTimeout;
    private String innodbAdaptiveMaxSleepDelay;
    private String performanceSchemaSessionConnectAttrsSize;
    private String replicateIgnoreTable;
    private String bulkInsertBufferSize;
    private String binlogDirectNonTransactionalUpdates;
    private String characterSetClient;
    private String innodbStrictMode;
    private String slaveParallelWorkers;
    private String alterAlgorithm;
    private String performanceSchemaDigestsSize;
    private String sqlLogBin;
    private String maxSortLength;
    private String performanceSchemaUsersSize;
    private String logBinIndex;
    private String logSlowVerbosity;
    private String maxConnections;
    private String threadPoolIdleTimeout;
    private String performanceSchemaMaxThreadClasses;
    private String innodbLockScheduleAlgorithm;
    private String idleTransactionTimeout;
    private String performanceSchemaMaxTableInstances;
    private String lowerCaseFileSystem;
    private String tableOpenCacheInstances;
    private String queryCacheWlockInvalidate;
    private String relayLogInfoFile;
    private String innodbAutoincLockMode;
    private String logSlowAdminStatements;
    private String lcMessages;
    private String maxHeapTableSize;
    private String lowerCaseTableNames;
    private String keyCacheDivisionLimit;
    private String innodbBufferPoolFilename;
    private String performanceSchemaMaxStatementClasses;
    private String innodbMaxPurgeLagDelay;
    private String maxBinlogCacheSize;
    private String innodbBufferPoolDumpNow;
    private String maxAllowedPacket;
    private String innodbBackgroundScrubDataInterval;
    private String longQueryTime;
    private String innodbStatusOutput;
    private String maxUserConnections;
    private String innodbUndoLogTruncate;
    private String oldPasswords;
    private String innodbAdaptiveHashIndex;
    private String optimizerUseConditionSelectivity;
    private String innodbEncryptLog;
    private String versionSslLibrary;
    private String defaultTmpStorageEngine;
    private String maxLengthForSortData;
    private String storedProgramCache;
    private String flush;
    private String sslCrl;
    private String characterSetFilesystem;
    private String innodbPageCleaners;
    private String characterSetSystem;
    private String maxSessionMemUsed;
    private String timeFormat;
    private String datadir;
    private String innodbLogCompressedPages;
    private String logWarnings;
    private String innodbDisableSortFileCache;
    private String ftMaxWordLen;
    private String innodbEncryptionRotationIops;
    private String slaveParallelThreads;
    private String haveDynamicLoading;
    private String maxSpRecursionDepth;
    private String syncBinlog;
    private String netReadTimeout;
    private String innodbPrintAllDeadlocks;
    private String queryPreallocSize;
    private String innodbStatsTraditional;
    private String rplSemiSyncMasterTimeout;
    private String logSlowDisabledStatements;
    private String maxSeeksForKey;
    private String innodbMaxDirtyPagesPct;
    private String innodbLogWriteAheadSize;
    private String slaveRunTriggersForRbr;
    private String defaultStorageEngine;
    private String keyBufferSize;
    private String characterSetsDir;
    private String maxTmpTables;
    private String systemVersioningAlterHistory;
    private String performanceSchemaMaxFileInstances;
    private String syncRelayLog;
    private String systemVersioningAsof;
    private String innodbDefaultEncryptionKeyId;
    private String disconnectOnExpiredPassword;
    private String innodbMaxUndoLogSize;
    private String secureAuth;
    private String maxRowidFilterSize;
    private String slaveNetTimeout;
    private String queryCacheSize;
    private String innodbStatsSamplePages;
    private String tableOpenCache;
    private String threadPoolPriority;
    private String logTcSize;
    private String interactiveTimeout;
    private String metadataLocksHashInstances;
    private String innodbAdaptiveFlushingLwm;
    private String binlogCommitWaitUsec;
    private String innodbDefragmentFrequency;
    private String readBufferSize;
    private String sqlWarnings;
    private String syncMasterInfo;
    private String strictPasswordValidation;
    private String pidFile;
    private String innodbSyncArraySize;
    private String tlsVersion;
    private String maxDelayedThreads;
    private String minExaminedRowLimit;
    private String threadPoolStallLimit;
    private String queryCacheType;
    private String performanceSchemaMaxSocketInstances;
    private String tmpdir;
    private String txReadOnly;
    private String flushTime;
    private String innodbRandomReadAhead;
    private String columnCompressionZlibStrategy;
    private String innodbUndoLogs;
    private String threadPoolMaxThreads;
    private String port;
    private String haveGeometry;
    private String rplSemiSyncMasterWaitNoSlave;
    private String oldAlterTable;
    private String logBinTrustFunctionCreators;
    private String sslCapath;
    private String innodbMonitorDisable;
    private String versionComment;
    private String myisamBlockSize;
    private String masterVerifyChecksum;
    private String maxBinlogStmtCacheSize;
    private String rplSemiSyncMasterEnabled;
    private String encryptTmpFiles;
    private String optimizerSelectivitySamplingLimit;
    private String innodbSpinWaitDelay;
    private String keyCacheAgeThreshold;
    private String innodbStatsIncludeDeleteMarked;
    private String binlogCommitWaitCount;
    private String innodbDefragmentStatsAccuracy;
    private String innodbLockWaitTimeout;
    private String sslCa;
    private String innodbOldBlocksTime;
    private String optimizerPruneLevel;
    private String queryCacheLimit;
    private String slaveParallelMaxQueued;
    private String timedMutexes;
    private String performanceSchemaHostsSize;
    private String innodbCompressionFailureThresholdPct;
    private String threadPoolSize;
    private String keyCacheFileHashSize;
    private String slowQueryLog;
    private String gtidCurrentPos;
    private String skipNetworking;
    private String gtidIgnoreDuplicates;
    private String divPrecisionIncrement;
    private String innodbPrefixIndexClusterOptimization;
    private String initConnect;
    private String checkConstraintChecks;
    private String tableDefinitionCache;
    private String slaveSkipErrors;
    private String optimizerSearchDepth;
    private String innodbBufferPoolDumpPct;
    private String ariaPageChecksum;
    private String innodbEncryptTables;
    private String namedPipe;
    private String collationDatabase;
    private String performanceSchemaMaxSocketClasses;
    private String innodbMonitorEnable;
    private String metadataLocksCacheSize;
    private String innodbLogBufferSize;
    private String hostCacheSize;
    private String hostname;
    private String innodbMaxPurgeLag;
    private String defaultPasswordLifetime;
    private String myisamMaxSortFileSize;
    private String multiRangeCount;
    private String innodbLruScanDepth;
    private String threadCacheSize;
    private String sqlNotes;
    private String innodbBufferPoolChunkSize;
    private String oldMode;
    private String haveSsl;
    private String defaultRegexFlags;
    private String relayLogRecovery;
    private String histogramType;
    private String binlogFormat;
    private String haveCompress;
    private String analyzeSamplePercentage;
    private String innodbUseAtomicWrites;
    private String keepFilesOnCreate;
    private String proxyProtocolNetworks;
    private String ftBooleanSyntax;
    private String innodbDoublewrite;
    private String slaveDdlExecMode;
    private String innodbStatsPersistent;
    private String characterSetDatabase;
    private String defaultWeekFormat;
    private String dateFormat;
    private String innodbChangeBufferMaxSize;
    private String performanceSchemaEventsStatementsHistorySize;
    private String innodbDefaultRowFormat;
    private String innodbUseNativeAio;
    private String slaveCompressedProtocol;
    private String progressReportTime;
    private String readRndBufferSize;
    private String innodbUndoTablespaces;
    private String versionCompileMachine;
    private String innodbBufDumpStatusFrequency;
    private String reportUser;
    private String deadlockSearchDepthShort;
    private String ariaCheckpointInterval;
    private String innodbFtMinTokenSize;
    private String maxJoinSize;
    private String innodbFtUserStopwordTable;
    private String logError;
    private String serverId;
    private String gtidDomainId;
    private String ariaMaxSortFileSize;
    private String maxRecursiveIterations;
    private String innodbTempDataFilePath;
    private String tmpDiskTableSize;
    private String innodbScrubLogSpeed;
    private String openFilesLimit;
    private String ariaSyncLogDir;
    private String innodbFtEnableStopword;
    private String haveOpenssl;
    private String innodbBackgroundScrubDataCheckInterval;
    private String initFile;
    private String ariaGroupCommitInterval;
    private String binlogAnnotateRowEvents;
    private String profilingHistorySize;
    private String txIsolation;
    private String innodbChangeBuffering;
    private String relayLogSpaceLimit;
    private String innodbStatsModifiedCounter;
    private String binlogOptimizeThreadScheduling;
    private String performanceSchemaMaxDigestLength;
    private String encryptBinlog;
    private String old;
    private String sqlSelectLimit;
    private String coreFile;
    private String ariaStatsMethod;
    private String replicateIgnoreDb;
    private String replicateDoDb;
    private String innodbCompressionAlgorithm;
    private String optimizerSwitch;
    private String pluginMaturity;
    private String logDisabledStatements;
    private String innodbPurgeThreads;
    private String bigTables;
    private String profiling;
    private String rplSemiSyncSlaveTraceLevel;
    private String ariaPagecacheBufferSize;
    private String binlogCacheSize;
    private String expensiveSubqueryLimit;
    private String performanceSchemaMaxFileHandles;
    private String innodbBufferPoolDumpAtShutdown;
    private String gtidBinlogPos;
    private String sslCrlpath;
    private String maxWriteLockCount;
    private String deadlockSearchDepthLong;
    private String replicateDoTable;
    private String mrrBufferSize;
    private String extraMaxConnections;
    private String innodbMaxDirtyPagesPctLwm;
    private String sqlSlaveSkipCounter;
    private String idleWriteTransactionTimeout;
    private String sqlBufferResult;
    private String foreignKeyChecks;
    private String haveQueryCache;
    private String innodbMonitorReset;
    private String lcTimeNames;
    private String innodbStatsAutoRecalc;
    private String tcpKeepaliveInterval;
    private String innodbCommitConcurrency;
    private String collationServer;
    private String innodbConcurrencyTickets;
    private String maxLongDataSize;
    private String innodbFatalSemaphoreWaitThreshold;
    private String innodbBufferPoolLoadAbort;
    private String innodbIdleFlushPct;
    private String sqlLogOff;
    private String innodbFtSortPllDegree;
    private String slaveTransactionRetryInterval;
    private String sessionTrackTransactionInfo;
    private String license;
    private String innodbFillFactor;
    private String versionSourceRevision;
    private String innodbAdaptiveFlushing;
    private String gtidBinlogState;
    private String innodbFilePerTable;
    private String rplSemiSyncMasterTraceLevel;
    private String extraPort;
    private String gtidStrictMode;
    private String ariaBlockSize;
    private String slaveTransactionRetryErrors;
    private String threadPoolPrioKickupTimer;
    private String logOutput;
    private String innodbDataHomeDir;
    private String largePageSize;
    private String innodbReadIoThreads;
    private String systemTimeZone;
    private String innodbWriteIoThreads;
    private String slaveTransactionRetries;
    private String innodbBufferPoolInstances;
    private String secureTimestamp;
    private String innodbUndoDirectory;
    private String autoIncrementIncrement;
    private String innodbDefragmentFillFactor;
    private String uniqueChecks;
    private String innodbFtResultCacheLimit;
    private String generalLogFile;
    private String optimizerTraceMaxMemSize;
    private String haveRtreeKeys;
    private String secureFilePriv;
    private String innodbEncryptionRotateKeyAge;
    private String sslKey;
    private String optimizerTrace;
    private String columnCompressionThreshold;
    private String ftStopwordFile;
    private String slaveLoadTmpdir;
    private String innodbReadAheadThreshold;
    private String ariaPagecacheDivisionLimit;
    private String innodbReadOnly;
    private String innodbImmediateScrubDataUncompressed;
    private String innodbDefragment;
    private String innodbMonitorResetAll;
    private String inPredicateConversionThreshold;
    private String innodbOptimizeFulltextOnly;
    private String innodbDefragmentFillFactorNRecs;
    private String innodbStatsMethod;
    private String ariaPagecacheAgeThreshold;
    private String sslCipher;
    private String ariaRecoverOptions;
    private String logSlowRateLimit;
    private String sslCert;
    private String innodbThreadConcurrency;
    private String slaveSqlVerifyChecksum;
    private String innodbBackgroundScrubDataUncompressed;
    private String netRetryCount;
    private String innodbBufferPoolSize;
    private String myisamStatsMethod;
    private String localInfile;
    private String innodbCompressionLevel;
    private String innodbBufferPoolLoadNow;
    private String rowidMergeBuffSize;
    private String ignoreDbDirs;
    private String maxErrorCount;
    private String binlogChecksum;
    private String ftMinWordLen;
    private String innodbPageSize;
    private String socket;
    private String ariaEncryptTables;
    private String ariaForceStartAfterRecoveryFailures;
    private String performanceSchemaEventsStatementsHistoryLongSize;
    private String innodbFlushMethod;
    private String rplSemiSyncMasterWaitPoint;
    private String gtidPosAutoEngines;
    private String ariaCheckpointLogActivity;
    private String threadPoolMode;
    private String innodbFlushLogAtTrxCommit;
    private String storageEngine;
    private String maxRelayLogSize;
    private String innodbLocksUnsafeForBinlog;
    private String maxPreparedStmtCount;
    private String sqlSafeUpdates;
    private String haveCrypt;
    private String rplSemiSyncSlaveEnabled;
    private String innodbCompressionPadPctMax;
    private String myisamUseMmap;
    private String encryptTmpDiskTables;
    private String innodbBufferPoolLoadAtStartup;
    private String version;
    private String collationConnection;
    private String innodbLogOptimizeDdl;
    private String delayedInsertTimeout;
    private String innodbFlushSync;
    private String deadlockTimeoutLong;
    private String relayLog;
    private String innodbCmpPerIndexEnabled;
    private String innodbOpenFiles;
    private String innodbOnlineAlterLogMaxSize;
    private String innodbLogFilesInGroup;
    private String updatableViewsWithLimit;
    private String pluginDir;
    private String skipNameResolve;
    private String innodbDeadlockDetect;
    private String innodbStatsOnMetadata;
    private String innodbFtMaxTokenSize;
    private String relayLogIndex;
    private String innodbFtServerStopwordTable;
    private String sqlQuoteShowCreate;
    private String readBinlogSpeedLimit;
    private String innodbLogGroupHomeDir;
    private String keyCacheSegments;
    private String innodbLargePrefix;
    private String innodbDefragmentNPages;
    private String performanceSchemaMaxTableHandles;
    private String logSlowFilter;
    private String innodbLogChecksums;
    private String logSlaveUpdates;
    private String ariaSortBufferSize;
    private String innodbDataFilePath;
    private String myisamSortBufferSize;
    private String rplSemiSyncSlaveDelayMaster;
    private String innodbOldBlocksPct;
    private String skipExternalLocking;
    private String myisamRepairThreads;
    private String threadConcurrency;
    private String innodbFtAuxTable;
    private String ariaPagecacheFileHashSize;
    private String slaveParallelMode;
    private String slaveTypeConversions;
    private String skipShowDatabase;
    private String sessionTrackSchema;
    private String autocommit;
    private String threadStack;
    private String eqRangeIndexDiveLimit;
    private String innodbChecksumAlgorithm;
    private String innodbForceLoadCorrupted;
    private String ariaLogPurgeType;
    private String innodbChecksums;
    private String mysql56TemporalFormat;
    private String transactionPreallocSize;
    private String datetimeFormat;
    private String versionCompileOs;
    private String deadlockTimeoutShort;
    private String protocolVersion;
    private String tcpKeepaliveProbes;
    private String slowQueryLogFile;
    private String ariaGroupCommit;
    private String sessionTrackStateChange;
    private String innodbLogFileSize;
    private String idleReadonlyTransactionTimeout;
    private String timeZone;
    private String replicateEventsMarkedForSkip;
    private String userstat;
    private String innodbVersion;
    private String sessionTrackSystemVariables;
    private String innodbTableLocks;
    private String innodbPurgeBatchSize;
    private String innodbForcePrimaryKey;
    private String histogramSize;
    private String tcpNodelay;
    private String replicateWildIgnoreTable;
    private String innodbFtTotalCacheSize;
    private String replicateAnnotateRowEvents;
    private String slaveDomainParallelThreads;
    private String useStatTables;
    private String enforceStorageEngine;
    private String innodbFastShutdown;
    private String innodbFtEnableDiagPrint;
    private String innodbPurgeRsegTruncateFrequency;
    private String haveSymlink;
    private String innodbSyncSpinLoops;
    private String innodbStatsPersistentSamplePages;
    private String innodbFlushNeighbors;
}
