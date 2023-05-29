public void addIngredient(int recipeId, String ingredient) {
    SQLiteDatabase db = this.getWritableDatabase();

    ContentValues values = new ContentValues();
    values.put(COLUMN_RECIPE_ID, recipeId);
    values.put(COLUMN_INGREDIENT_NAME, ingredient);

    db.insert(TABLE_INGREDIENTS, null, values);
    db.close();
}
