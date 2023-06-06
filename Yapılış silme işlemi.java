public void deleteInstruction(int instructionId) {
    SQLiteDatabase db = this.getWritableDatabase();
    db.delete(TABLE_INSTRUCTIONS, COLUMN_INSTRUCTION_ID + " = ?", new String[]{String.valueOf(instructionId)});
    db.close();
}
