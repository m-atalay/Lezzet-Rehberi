public void updateCategory(int categoryId, String newCategoryName) {
    SQLiteDatabase db = this.getWritableDatabase();

    ContentValues values = new ContentValues();
    values.put(COLUMN_CATEGORY_NAME, newCategoryName);

    db.update(TABLE_CATEGORIES, values, COLUMN_CATEGORY_ID + " = ?", new String[]{String.valueOf(categoryId)});
    db.close();
}
