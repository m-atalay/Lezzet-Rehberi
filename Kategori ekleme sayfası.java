public void addCategory(String categoryName) {
    SQLiteDatabase db = this.getWritableDatabase();

    ContentValues values = new ContentValues();
    values.put(COLUMN_CATEGORY_NAME, categoryName);

    db.insert(TABLE_CATEGORIES, null, values);
    db.close();
}
