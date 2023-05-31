public void deleteIngredient(int ingredientId) {
    SQLiteDatabase db = this.getWritableDatabase();
    db.delete(TABLE_INGREDIENTS, COLUMN_INGREDIENT_ID + " = ?", new String[]{String.valueOf(ingredientId)});
    db.close();
}
