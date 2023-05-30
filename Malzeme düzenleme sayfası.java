public void updateIngredient(int ingredientId, String newIngredient) {
    SQLiteDatabase db = this.getWritableDatabase();

    ContentValues values = new ContentValues();
    values.put(COLUMN_INGREDIENT_NAME, newIngredient);

    db.update(TABLE_INGREDIENTS, values, COLUMN_INGREDIENT_ID + " = ?", new String[]{String.valueOf(ingredientId)});
    db.close();
}
