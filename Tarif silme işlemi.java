public void deleteRecipe(int recipeId) {
    SQLiteDatabase db = this.getWritableDatabase();
    db.delete(TABLE_RECIPES, COLUMN_RECIPE_ID + " = ?", new String[]{String.valueOf(recipeId)});
    db.close();
}
