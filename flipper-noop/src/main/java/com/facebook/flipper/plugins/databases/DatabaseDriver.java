/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.flipper.plugins.databases;

import android.content.Context;
import java.util.List;

/**
 * Abstract class allowing to implement different drivers interfacing with Databases.
 *
 * @param <DESCRIPTOR> A DatabaseDescriptor object that is called for each databases provider by the
 * driver
 */
public abstract class DatabaseDriver<DESCRIPTOR extends DatabaseDescriptor> {

  private final Context mContext;

  public DatabaseDriver(final Context context) {
    mContext = context;
  }

  public Context getContext() {
    return mContext;
  }

  public abstract List<DESCRIPTOR> getDatabases();

  public abstract List<String> getTableNames(DESCRIPTOR databaseDescriptor);

  public abstract DatabaseGetTableDataResponse getTableData(
      DESCRIPTOR databaseDescriptor,
      String table,
      String order,
      boolean reverse,
      int start,
      int count);

  public abstract DatabaseGetTableStructureResponse getTableStructure(
      DESCRIPTOR databaseDescriptor, String table);

  public abstract DatabaseGetTableInfoResponse getTableInfo(
      DESCRIPTOR databaseDescriptor, String table);

  public abstract DatabaseExecuteSqlResponse executeSQL(
      DESCRIPTOR databaseDescriptor, String query);

  public static class DatabaseGetTableDataResponse {
    public DatabaseGetTableDataResponse(
        final List<String> columns,
        final List<List<Object>> values,
        int start,
        int count,
        long total) {
    }
  }

  public static class DatabaseGetTableStructureResponse {
    public DatabaseGetTableStructureResponse(
        final List<String> structureColumns,
        final List<List<Object>> structureValues,
        final List<String> indexesColumns,
        final List<List<Object>> indexesValues) {
    }
  }

  public static class DatabaseGetTableInfoResponse {

    public final String definition;

    public DatabaseGetTableInfoResponse(String definition) {
      this.definition = definition;
    }
  }

  public static class DatabaseExecuteSqlResponse {
    private DatabaseExecuteSqlResponse(
        final String type,
        final List<String> columns,
        final List<List<Object>> values,
        Long insertedId,
        Integer affectedCount) {

    }

    public static DatabaseExecuteSqlResponse successfulSelect(
        List<String> columns, List<List<Object>> values) {
      return null;
    }

    public static DatabaseExecuteSqlResponse successfulInsert(long insertedId) {
      return null;
    }

    public static DatabaseExecuteSqlResponse successfulUpdateDelete(int affectedRows) {
      return null;
    }

    public static DatabaseExecuteSqlResponse successfulRawQuery() {
      return null;
    }
  }
}
