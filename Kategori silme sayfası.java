public void deleteCategory(int categoryId) {
    SQLiteDatabase db = this.getWritableDatabase();
    db.delete(TABLE_CATEGORIES, COLUMN_CATEGORY_ID + " = ?", new String[]{String.valueOf(categoryId)});
    db.close();
}
