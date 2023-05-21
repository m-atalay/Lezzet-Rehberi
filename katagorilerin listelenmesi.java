public List<String> getAllCategories() {
    List<String> categoryList = new ArrayList<>();

    String selectQuery = "SELECT " + COLUMN_CATEGORY_NAME + " FROM " + TABLE_CATEGORIES;

    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery(selectQuery, null);

    if (cursor.moveToFirst()) {
        do {
            String categoryName = cursor.getString(cursor.getColumnIndex(COLUMN_CATEGORY_NAME));
            categoryList.add(categoryName);
        } while (cursor.moveToNext());
    }

    cursor.close();
    db.close();

    return categoryList;
}
